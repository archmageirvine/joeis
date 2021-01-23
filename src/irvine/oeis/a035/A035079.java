package irvine.oeis.a035;

import irvine.math.z.Z;
import irvine.oeis.GeneralizedEulerTransform;
import irvine.oeis.a007.A007561;

/**
 * A035079 Weigh transform of A007561.
 * @author Georg Fischer
 */
public class A035079 extends GeneralizedEulerTransform {

  /** Construct the sequence. */
  public A035079() {
    super(0, 1);
    mSeqF = new A007561();
    mSeqF.next();
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
