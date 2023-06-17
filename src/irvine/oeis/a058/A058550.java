package irvine.oeis.a058;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A058550 Eisenstein series E_14(q) (alternate convention E_7(q)).
 * @author Sean A. Irvine
 */
public class A058550 extends AbstractSequence {

  /* Construct the sequence. */
  public A058550() {
    super(0);
  }

  private int mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    return Jaguar.factor(mN).sigma(13).multiply(24).negate();
  }
}
