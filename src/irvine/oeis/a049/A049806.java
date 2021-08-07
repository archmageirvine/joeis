package irvine.oeis.a049;

import irvine.math.z.Z;
import irvine.oeis.a023.A023022;

/**
 * A049806 Number of Farey fractions of order n that are &lt;=1/2; cf. A049805.
 * @author Sean A. Irvine
 */
public class A049806 extends A023022 {

  private Z mSum = null;

  @Override
  public Z next() {
    mSum = mSum == null ? Z.ONE : mSum.add(super.next());
    return mSum;
  }
}
