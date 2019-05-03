package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004053 For <code>m=2,3,...</code>, write m in bases <code>2,3,..,m</code>.
 * @author Sean A. Irvine
 */
public class A004053 implements Sequence {

  private int mN = 1;
  private int mM = 1;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 2;
    }
    // Term 201 onwards will fail due to letters in the results
    return new Z(Long.toString(mN, mM));
  }
}
