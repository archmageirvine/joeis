package irvine.oeis.a023;

import irvine.math.z.Z;

/**
 * A023112 Numbers n such that n remains square when digit 4 is appended.
 * @author Sean A. Irvine
 */
public class A023112 extends A023111 {

  @Override
  public Z next() {
    return super.next().multiply(4);
  }
}
