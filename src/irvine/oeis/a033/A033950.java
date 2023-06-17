package irvine.oeis.a033;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A033950 Refactorable numbers: number of divisors of k divides k. Also known as tau numbers.
 * @author Sean A. Irvine
 */
public class A033950 extends AbstractSequence {

  /** Construct the sequence. */
  public A033950() {
    super(1);
  }

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (mN.mod(Jaguar.factor(mN).sigma0()).isZero()) {
        return mN;
      }
    }
  }
}
