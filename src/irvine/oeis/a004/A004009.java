package irvine.oeis.a004;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A004009 Expansion of Eisenstein series E_4(q) (alternate convention E_2(q)); theta series of E_8 lattice.
 * @author Sean A. Irvine
 */
public class A004009 extends AbstractSequence {

  /* Construct the sequence. */
  public A004009() {
    super(0);
  }

  private long mN = -1;

  @Override
  public Z next() {
    return ++mN == 0 ? Z.ONE : Jaguar.factor(mN).sigma(3).multiply(240);
  }
}
