package irvine.oeis.a030;

import irvine.math.z.Z;

/**
 * A030289 a(n+1) is the next larger cube with no digits in common with a(n), a(0) = 0.
 * @author Sean A. Irvine
 */
public class A030289 extends A030290 {

  @Override
  public Z next() {
    return super.next().pow(3);
  }
}
