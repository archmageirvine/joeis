package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026272 a(n) = smallest k such that k=a(n-k-1) is the only appearance of k so far; if there is no such k, then a(n) = least positive integer that has not yet appeared.
 * @author Sean A. Irvine
 */
public class A026272 extends A026242 {

  {
    super.next();
    super.next();
  }

  @Override
  public Z next() {
    return super.next().subtract(1);
  }
}
