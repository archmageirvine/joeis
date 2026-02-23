package irvine.oeis.a163;

import java.util.TreeSet;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A163587 Primes of the form floor(2 * (k+j) * log(2*(k+j))), 0 &lt;= j &lt;= k.
 * @author Sean A. Irvine
 */
public class A163587 extends Sequence1 {

  private final TreeSet<Z> mA = new TreeSet<>();
  private long mN = 1;

  private Z f(final long n) {
    return CR.valueOf(2 * n).log().multiply(2 * n).floor();
  }

  @Override
  public Z next() {
    while (mA.isEmpty() || mA.first().compareTo(2 * mN * (int) Math.log(2 * mN)) > 0) {
      for (long j = 0; j <= mN; ++j) {
        final Z v = f(mN + j);
        if (v.isProbablePrime()) {
          mA.add(v);
        }
      }
      ++mN;
    }
    return mA.pollFirst();
  }
}

