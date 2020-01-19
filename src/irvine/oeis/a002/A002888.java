package irvine.oeis.a002;

import irvine.math.z.Z;

/**
 * A002888 <code>a(n)</code> is the cutting number of the tree corresponding to <code>A002887(n)</code>.
 * @author Sean A. Irvine
 */
public class A002888 extends A002887 {

  @Override
  public Z next() {
    super.next();
    return Z.valueOf(mFirstCuttingNumber.get(mM));
  }
}
