package irvine.oeis.a388;

import irvine.math.z.Z;
import irvine.oeis.a390.A390148;

/**
 * A388858 Column 2 of table A390148.
 * @author Sean A. Irvine
 */
public class A388858 extends A390148 {

  @Override
  public Z next() {
    super.next();
    final Z res = super.next();
    super.next();
    super.next();
    return res;
  }
}
