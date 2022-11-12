package irvine.oeis.a060;

import irvine.math.z.Z;
import irvine.oeis.a057.A057660;

/**
 * A060367 Average order of an element in a cyclic group of order n rounded down.
 * @author Sean A. Irvine
 */
public class A060367 extends A057660 {

  @Override
  public Z next() {
    return super.next().divide(mN);
  }
}
