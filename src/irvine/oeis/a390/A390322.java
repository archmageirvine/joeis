package irvine.oeis.a390;

import irvine.math.z.Z;

/**
 * A390322 Column 1 of table A390148.
 * @author Sean A. Irvine
 */
public class A390322 extends A390148 {

  @Override
  public Z next() {
    final Z res = super.next();
    super.next();
    super.next();
    super.next();
    return res;
  }
}
