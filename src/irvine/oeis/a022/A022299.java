package irvine.oeis.a022;

import irvine.math.z.Z;

/**
 * A022299 Sequence A022298 divided by 2.
 * @author Sean A. Irvine
 */
public class A022299 extends A022298 {

  @Override
  public Z next() {
    return super.next().divide2();
  }
}
