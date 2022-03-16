package irvine.oeis.a067;

import irvine.math.z.Z;

/**
 * A067468 Numbers n such that 7 is the first digit of 7^n.
 * @author Georg Fischer
 */
public class A067468 extends A067485 {

  @Override
  public Z next() {
    super.next();
    return Z.valueOf(mN - 1);
  }
}
