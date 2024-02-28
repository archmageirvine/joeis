package irvine.oeis.a068;

import java.util.Arrays;

import irvine.math.IntegerUtils;
import irvine.math.Mobius;
import irvine.math.partitions.IntegerPartition;
import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A068596 Number of 4-ary Lyndon words whose trace and subtrace are both 0 mod 4.
 * @author Sean A. Irvine
 */
public class A068596 extends Sequence1 {

  // Thanks to Max Alekseyev
  // Cf. lyndon_.gp

  private final int mM;
  private final int mTrace;
  private final int mSubtrace;
  private int mN = 0;

  protected A068596(final int alphabetSize, final int trace, final int subtrace) {
    mM = alphabetSize;
    mTrace = trace;
    mSubtrace = subtrace;
  }

  /** Construct the sequence. */
  public A068596() {
    this(4, 0, 0);
  }

  private boolean bump(final int[] v, final int max) {
    for (int k = v.length - 1; k >= 0; --k) {
      if (++v[k] <= max) {
        for (int j = k + 1; j < v.length; ++j) {
          v[j] = v[k];
        }
        return true;
      }
    }
    return false;
  }

  // Max has a different way of computing this in Pari
  private Z s(final int n, final int m, final int t, final int s, final int tm, final int sm) {
    Z sum = Z.ZERO;
    final int[] v = new int[n];
    final int[] c = new int[m + 1];
    Arrays.fill(v, 1);
    do {
      int sv = 0;
      int ssv = 0;
      for (final int u : v) {
        sv += u;
        ssv += u * u;
      }
      if (sv % tm == t && ssv % sm == s) {
        IntegerPartition.toCountForm(v, c);
        sum = sum.add(Binomial.multinomial(n, c));
      }
    } while (bump(v, m));
    return sum;
  }

  protected Z s(final int n, final int m, final int t, final int s) {
    final int m2 = (m & 1) == 1 ? m : 2 * m;
    return s(n, m, t, (t * t + 2 * (m2 - s)) % m2, m, m2);
  }
  //{ WordsZmTS(n,m,T,S) = WordsZmTP(n,m,Mod(T,m),Mod(T^2 - 2*S,if(m%2,m,2*m))); }

  protected Z lyndonZmTS(final int n, final int m, final int trace, final int subtrace) {
    final int m2 = (m & 1) == 1 ? m : 2 * m;
    final int s2 = (trace * trace + 2 * (m2 - subtrace)) % m2;
    assert s2 >= 0;
    return Integers.SINGLETON.sumdiv(n, d -> {
      final int nd = n / d;
      final int mobius = Mobius.mobius(nd);
      if (mobius != 0) {
        final int g1 = IntegerUtils.gcd(nd, m);
        final int g2 = IntegerUtils.gcd(nd, m2);
        if (trace % g1 == 0 && s2 % g2 == 0) {
          final int n1 = nd / g1;
          final int n2 = nd / g2;
          final int mg1 = m / g1;
          final int mg2 = m2 / g2;
          final int i1 = IntegerUtils.modInverse(n1, mg1);
          final int i2 = IntegerUtils.modInverse(n2, mg2);
          return s(d, m, ((trace / g1) * i1) % mg1, ((s2 / g2) * i2) % mg2, mg1, mg2).multiply(mobius);
        }
      }
      return Z.ZERO;
    }).divide(n);
  }

  @Override
  public Z next() {
    return lyndonZmTS(++mN, mM, mTrace, mSubtrace);
  }
}
