package irvine.oeis.a077;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a045.A045784;
import irvine.oeis.a045.A045785;
import irvine.oeis.a045.A045786;
import irvine.oeis.a045.A045787;
import irvine.oeis.a045.A045788;
import irvine.oeis.a045.A045789;
import irvine.oeis.a045.A045791;
import irvine.oeis.a045.A045792;
import irvine.oeis.a045.A045793;

/**
 * A077689 Rearrangement of squares such that the most significant digits follow the cyclic pattern 1,2,3,4,5,6,7,8,9,1,2,3,4,5,6,7,8,9,1,2,3,...
 * @author Sean A. Irvine
 */
public class A077689 extends Sequence1 {

  private int mN = -1;
  private final Sequence[] mS = {
    new A045784(),
    new A045785(),
    new A045786(),
    new A045787(),
    new A045788(),
    new A045789(),
    new A045791(),
    new A045792(),
    new A045793(),
  };

  @Override
  public Z next() {
    if (++mN >= mS.length) {
      mN = 0;
    }
    return mS[mN].next();
  }
}
