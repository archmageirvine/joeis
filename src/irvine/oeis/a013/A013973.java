package irvine.oeis.a013;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013973 Expansion of Eisenstein series <code>E_6(q)</code> (alternate convention <code>E_3(q))</code>.
 * @author Sean A. Irvine
 */
public class A013973 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    return ++mN == 0 ? Z.ONE : Cheetah.factor(mN).sigma(5).multiply(-504);
  }
}
