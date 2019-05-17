package irvine.oeis.a022;

import irvine.math.z.Z;

/**
 * A022483 Length of n-th term of <code>A022482</code>.
 * @author Sean A. Irvine
 */
public class A022483 extends A022482 {

  @Override
  public Z next() {
    return Z.valueOf(super.next().toString().length());
  }
}
