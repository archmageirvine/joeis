package irvine.oeis.a013;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A013973 Expansion of Eisenstein series E_6(q) (alternate convention E_3(q)).
 * @author Sean A. Irvine
 */
public class A013973 extends AbstractSequence {

  /** Construct the sequence. */
  public A013973() {
    super(0);
  }

  private long mN = -1;

  @Override
  public Z next() {
    return ++mN == 0 ? Z.ONE : Jaguar.factor(mN).sigma(5).multiply(-504);
  }
}
