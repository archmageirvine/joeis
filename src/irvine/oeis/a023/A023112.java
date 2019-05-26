package irvine.oeis.a023;

import irvine.math.z.Z;

/**
 * A023112.
 * @author Sean A. Irvine
 */
public class A023112 extends A023111 {

  @Override
  public Z next() {
    return super.next().multiply(4);
  }
}
