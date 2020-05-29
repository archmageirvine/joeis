package irvine.oeis.a032;

import irvine.math.z.Z;
import irvine.oeis.a000.A000358;

/**
 * A032189 Number of ways to partition n elements into pie slices each with an odd number of elements.
 * @author Sean A. Irvine
 */
public class A032189 extends A000358 {

  @Override
  public Z next() {
    return super.next().subtract(1 - (mN & 1));
  }
}
