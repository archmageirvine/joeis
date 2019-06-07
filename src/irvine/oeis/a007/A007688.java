package irvine.oeis.a007;

import irvine.math.z.Z;

/**
 * A007688 Number of 5-colorings of cyclic group of order <code>n</code>.
 * @author Sean A. Irvine
 */
public class A007688 extends A007687 {

  private int mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(colorings(5, ++mN));
  }
}
