package irvine.oeis.a058;

import irvine.math.z.Z;

/**
 * A058198 Where d(m) (number of divisors, A000005) has risen by at least n.
 * @author Sean A. Irvine
 */
public class A058198 extends A058197 {

  @Override
  public Z next() {
    return super.next().add(1);
  }
}
