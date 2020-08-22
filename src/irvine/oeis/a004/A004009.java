package irvine.oeis.a004;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004009 Expansion of Eisenstein series E_4(q) (alternate convention E_2(q)); theta series of E_8 lattice.
 * @author Sean A. Irvine
 */
public class A004009 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    return ++mN == 0 ? Z.ONE : Cheetah.factor(mN).sigma(3).multiply(240);
  }
}
