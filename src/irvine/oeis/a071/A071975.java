package irvine.oeis.a071;

import irvine.math.q.QUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A071926.
 * @author Sean A. Irvine
 */
public class A071975 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return QUtils.inverseSagher(Z.valueOf(++mN)).den();
  }
}
