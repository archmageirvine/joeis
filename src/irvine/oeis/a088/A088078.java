package irvine.oeis.a088;

import irvine.math.z.Z;

/**
 * A088078 Leading column of triangle defined in A088079.
 * @author Sean A. Irvine
 */
public class A088078 extends A088079 {

  @Override
  public Z next() {
    return super.next().subtract(mN);
  }
}

