package irvine.oeis.a050;

import irvine.math.z.Z;

/**
 * A050637 a(1) = 2; a(n+1)^2 is next smallest square ending with a(n)^2.
 * @author Sean A. Irvine
 */
public class A050637 extends A050636 {

  @Override
  public Z next() {
    return super.next().sqrt();
  }
}
