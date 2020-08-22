package irvine.oeis.a022;

import irvine.math.z.Z;

/**
 * A022306 Sequence A022305 divided by 2.
 * @author Sean A. Irvine
 */
public class A022306 extends A022305 {

  @Override
  public Z next() {
    return super.next().divide2();
  }
}
