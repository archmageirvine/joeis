package irvine.oeis.a064;

import irvine.math.z.Z;
import irvine.oeis.a000.A000048;

/**
 * A064355 Number of subsets of {1,2,..n} that sum to 1 mod n.
 * @author Sean A. Irvine
 */
public class A064355 extends A000048 {

  {
    super.next();
    setOffset(1);
  }

  @Override
  public Z next() {
    return super.next().multiply2();
  }
}
