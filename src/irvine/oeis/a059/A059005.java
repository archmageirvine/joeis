package irvine.oeis.a059;

import java.util.TreeSet;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A059005 Primes whose reversal is a tenth power.
 * @author Sean A. Irvine
 */
public class A059005 extends Sequence1 {

  private final TreeSet<Z> mA = new TreeSet<>();
  private final int mPower;
  private Z mN = Z.TWO;
  private Z mLim = Z.ONE;

  protected A059005(final int power) {
    mPower = power;
  }

  /** Construct the sequence. */
  public A059005() {
    this(10);
  }

  @Override
  public Z next() {
    while (mA.isEmpty()) {
      // Deal with all potential solutions of the same number of digits
      mLim = mLim.multiply(10);
      Z t;
      while ((t = mN.pow(mPower)).compareTo(mLim) < 0) {
        final Z rev = Functions.REVERSE.z(t);
        if (rev.isProbablePrime()) {
          mA.add(rev);
        }
        mN = mN.add(1);
        if (mN.mod(10) == 0) {
          mN = mN.add(1); // Cannot end in 0 (otherwise reverse will have less digits
        }
      }
    }
    return mA.pollFirst();
  }
}
