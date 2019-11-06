package irvine.oeis.a027;

import irvine.math.z.Z;

/**
 * A027462 First column of <code>A027448</code>.
 * @author Sean A. Irvine
 */
public class A027462 extends A027448 {

  private long mN = -1;

  @Override
  public Z next() {
    step();
    return mMatrix.get(++mN, 0).num();
  }
}
