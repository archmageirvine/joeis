package irvine.oeis.a052;

import irvine.math.z.Z;

/**
 * A052064 Cubes containing no palindromic substring except single digits.
 * @author Sean A. Irvine
 */
public class A052064 extends A052063 {

  @Override
  public Z next() {
    return super.next().pow(3);
  }
}

