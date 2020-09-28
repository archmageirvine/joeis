package irvine.oeis.a035;

import irvine.math.z.Z;

/**
 * A035125 Roots of 'non-palindromic cubes remaining cubic when written backwards'.
 * @author Sean A. Irvine
 */
public class A035125 extends A035124 {

  @Override
  public Z next() {
    return super.next().root(3);
  }
}
