package irvine.oeis.a013;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A013974 Eisenstein series E_10(q) (alternate convention E_5(q)).
 * @author Sean A. Irvine
 */
public class A013974 extends AbstractSequence {

  /* Construct the sequence. */
  public A013974() {
    super(0);
  }

  private long mN = -1;

  @Override
  public Z next() {
    return ++mN == 0 ? Z.ONE : Jaguar.factor(mN).sigma(9).multiply(-264);
  }
}
