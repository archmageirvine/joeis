package irvine.oeis.a065;

import irvine.math.z.Z;

/**
 * A065400 a(n) is the greatest integer m such that (1) written in factorial base it is also readable as if it is in base n and (2) this base-n value is greater than or equal to m.
 * @author Sean A. Irvine
 */
public class A065400 extends A065399 {

  @Override
  public Z next() {
    return f(super.next());
  }
}
