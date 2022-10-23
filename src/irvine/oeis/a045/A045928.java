package irvine.oeis.a045;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A045928 The generalized Connell sequence C_{3,2}.
 * @author Sean A. Irvine
 */
public class A045928 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(3 * ++mN - 2 * (1 + LongUtils.sqrt(mN - 1)));
  }
}
