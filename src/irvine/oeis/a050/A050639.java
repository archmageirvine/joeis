package irvine.oeis.a050;

import irvine.math.z.Z;

/**
 * A050639 a(1) = 3; a(n+1)^2 is next smallest square ending with a(n)^2.
 * @author Sean A. Irvine
 */
public class A050639 extends A050638 {

  @Override
  public Z next() {
    return super.next().sqrt();
  }
}
