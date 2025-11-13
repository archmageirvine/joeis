package irvine.oeis.a390;

import irvine.math.z.Z;

/**
 * A390465 Column 4 of table A390148.
 * @author Sean A. Irvine
 */
public class A390465 extends A390148 {

  @Override
  public Z next() {
    super.next();
    super.next();
    super.next();
    return super.next();
  }
}
