package irvine.oeis.a050;

import irvine.math.z.Z;

/**
 * A050629 a(n+1)^2 is next smallest nontrivial square containing a(n)^2 as a substring, initial term is 1.
 * @author Sean A. Irvine
 */
public class A050629 extends A050628 {

  @Override
  public Z next() {
    return super.next().sqrt();
  }
}
