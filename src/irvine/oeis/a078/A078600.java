package irvine.oeis.a078;

import java.util.Arrays;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.function.Functions;
import irvine.math.group.GaloisField;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence2;
import irvine.oeis.UnimplementedSequence;
import irvine.oeis.a246.A246655;
import irvine.util.Permutation;
import irvine.util.string.StringUtils;

/**
 * A078600 Number of permutation polynomials over F_q of degree &lt; q-2, as q runs through the prime powers &gt;= 2.
 * @author Sean A. Irvine
 */
public class A078600 extends Sequence2 implements UnimplementedSequence {

  // todo This is not working properly for prime powers -- probably problems with GaloisField

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private final Sequence mPrimePrimes = new A246655();

  @Override
  public Z next() {
    final Z q = mPrimePrimes.next();
    final FactorSequence fs = Jaguar.factor(q); // q = p^e
    final Z p = fs.toZArray()[0];
    final GaloisField fld = new GaloisField(p, fs.getExponent(p));
    final int size = fld.size().intValueExact();
    if (mVerbose) {
      StringUtils.message("Doing: " + p + "^" + fs.getExponent(p) + " = " + size);
    }
    final Z effort = Functions.FACTORIAL.z(size);
    final Permutation perm = new Permutation(size);
    int[] s;
    long cnt = 0;
    long k = 0;
    while ((s = perm.next()) != null) {
      Z sum = Z.ZERO;
      for (final Z c : fld) {
        final Z sigmac = Z.valueOf(s[c.intValue()]);
        sum = fld.add(sum, fld.multiply(c, sigmac));
        //System.out.println(c + "*" + sigmac + "=" + fld.multiply(c, sigmac) + " sum is now " + sum + " in perm " + Arrays.toString(s));
      }
      System.out.println("Perm: " + Arrays.toString(s) + " has sum " + sum);
      if (sum.isZero()) {
        ++cnt;
      }
      if (mVerbose && ++k % 10000000 == 0) {
        StringUtils.message("Done " + k + "/" + effort + " permutations");
      }
    }
    return Z.valueOf(cnt);
  }
}

