package irvine.oeis.a054;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A054995 A version of Josephus problem: a(n) is the surviving integer under the following elimination process. Arrange 1,2,3,...,n in a circle, increasing clockwise. Starting with i=1, delete the integer two places clockwise from i. Repeat, counting two places from the next undeleted integer, until only one integer remains.
 * @author Sean A. Irvine
 */
public class A054995 implements Sequence {

  private long mA = 0;
  private long mN = 0;

  @Override
  public Z next() {
    mA = (mA + 2) % ++mN + 1;
    return Z.valueOf(mA);
  }
}

