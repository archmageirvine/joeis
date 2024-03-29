package irvine.oeis.a058;

import irvine.math.z.Z;
import irvine.oeis.Conjectural;
import irvine.oeis.Sequence0;

/**
 * A058764 Smallest number x such that cototient(x) = 2^n.
 * @author Sean A. Irvine
 */
public class A058764 extends Sequence0 implements Conjectural {

  // After R. J. Mathar, conjectural

  private int mN = -1;

  @Override
  public Z next() {
    return (mN > 0 ? Z.THREE : Z.FOUR).shiftLeft(mN++);
  }
}
