package irvine.oeis.a083;

import irvine.math.z.Z;
import irvine.oeis.a081.A081454;

/**
 * A083489 Triangle read by rows where the n-th row gives the reverse-lexicographically earliest sequence of n distinct integers &gt; 1 whose product equals the smallest possible square (=A081456(n)).
 * @author Sean A. Irvine
 */
public class A083489 extends A081454 {

  private int mN = 0;
  private int mM = 0;
  {
    super.next();
  }

  @Override
  public Z next() {
    if (++mM >= mN) {
      ++mN;
      mM = 0;
      super.next(); // skip leading 1
    }
    return super.next();
  }
}
