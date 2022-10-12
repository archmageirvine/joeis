package irvine.oeis.a059;

import irvine.math.z.Z;

/**
 * A059835 Form triangle as follows: start with three single digits: 0, 1, 2. Each succeeding row is a concatenation of the previous three rows.
 * @author Sean A. Irvine
 */
public class A059835 extends A059832 {

  @Override
  public Z next() {
    return super.next().subtract(1);
  }
}
