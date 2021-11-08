package irvine.oeis.a035;

import irvine.math.z.Z;
import irvine.oeis.GeneralizedEulerTransform;
import irvine.oeis.a000.A000220;

/**
 * A035056 Number of asymmetric forests with n nodes.
 * @author Georg Fischer
 */
public class A035056 extends GeneralizedEulerTransform {

  /** Construct the sequence. */
  public A035056() {
    super(0, 1);
    mSeqF = new A000220();
  }

  @Override
  protected Z[] advanceF(final long k) {
    return new Z[]{ mSeqF.next().negate() };
  }

  @Override
  protected Z advanceG(final long k) {
    return Z.NEG_ONE;
  }

}
