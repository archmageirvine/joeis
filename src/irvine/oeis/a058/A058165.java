package irvine.oeis.a058;

import irvine.math.z.Z;

/**
 * A058165 Number of labeled lattices with fixed a fixed bottom and top.
 * @author Sean A. Irvine
 */
public class A058165 extends A058164 {

  {
    setOffset(2);
  }

  @Override
  public Z next() {
    if (mN <= 0) {
      super.next();
    }
    return super.next().divide(mN - 1);
  }
}
