package irvine.oeis.a390;

import irvine.math.z.Z;

/**
 * A390464 Column 3 of table A390148.
 * @author Sean A. Irvine
 */
public class A390464 extends A390148 {

  @Override
  public Z next() {
    super.next();
    super.next();
    final Z res = super.next();
    super.next();
    return res;
  }
}
