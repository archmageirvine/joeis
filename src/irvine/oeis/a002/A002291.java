package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.a225.A225872;

/**
 * A002291 Absolute value of Glaisher's beta'(2n+1).
 * @author Sean A. Irvine
 */
public class A002291 extends A225872 {

  @Override
  public Z next() {
    return super.next().abs();
  }
}
