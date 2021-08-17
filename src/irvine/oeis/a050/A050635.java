package irvine.oeis.a050;

import irvine.math.z.Z;

/**
 * A050635 a(n+1)^2 is next smallest square ending with a(n)^2, initial term is 1.
 * @author Sean A. Irvine
 */
public class A050635 extends A050634 {

  @Override
  public Z next() {
    return super.next().sqrt();
  }
}
