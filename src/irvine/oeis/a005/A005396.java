package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.a006.A006774;

/**
 * A005396 Number of 2n-step polygons on honeycomb.
 * @author Sean A. Irvine
 */
public class A005396 extends A006774 {

  /** Construct the sequence. */
  public A005396() {
    super(2);
  }

  @Override
  public Z next() {
    return super.next().multiply(Math.max(1, mN));
  }
}
