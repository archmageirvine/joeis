package irvine.oeis.a058;

import irvine.math.z.Z;

/**
 * A058186 Numbers (written in base 5) which appear the same when written in base 5 and base 10/2.
 * @author Sean A. Irvine
 */
public class A058186 extends A058185 {

  @Override
  public Z next() {
    return new Z(super.next().toString(5));
  }
}
