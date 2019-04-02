package irvine.oeis.a013;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013974 Eisenstein series E_10(q) (alternate convention E_5(q)).
 * @author Sean A. Irvine
 */
public class A013974 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    return ++mN == 0 ? Z.ONE : Cheetah.factor(mN).sigma(9).multiply(-264);
  }
}
