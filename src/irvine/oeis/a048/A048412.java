package irvine.oeis.a048;

import irvine.math.z.Z;

/**
 * A048412 a(n)^2 is a square whose consecutive digits differ by 1.
 * @author Sean A. Irvine
 */
public class A048412 extends A048411 {

  @Override
  public Z next() {
    return super.next().sqrt();
  }
}
