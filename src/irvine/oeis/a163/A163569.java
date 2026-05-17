package irvine.oeis.a163;

import java.util.Arrays;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A163569 Numbers of the form p^3*q^2*r where p, q and r are three distinct primes.
 * @author Sean A. Irvine
 */
public class A163569 extends AbstractSequence {

  private long mN;
  private final int[] mA; // sorted list of required exponents
  private final int mALen; // length of mA

  /** Construct the sequence. */
  public A163569() {
    this(1, 3, 2, 1);
  }

  /**
   * Generic constructor with parameters.
   * @param offset first index
   * @param exponents list of exponents (maybe unsorted)
   */
  public A163569(final int offset, final int... exponents) {
    super(offset);
    mN = offset - 1;
    mA = exponents;
    mALen = mA.length;
    Arrays.sort(mA);
  }

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs0 = Jaguar.factor(++mN);
      if (fs0.omega() == mALen) {
        final int[] b = new int[fs0.omega()];
        int k = 0;
        for (final Z p : fs0.toZArray()) {
          b[k++] = fs0.getExponent(p);
        }
        Arrays.sort(b);
        if (Arrays.equals(mA, b)) {
          return Z.valueOf(mN);
        }
      }
    }
  }
}
