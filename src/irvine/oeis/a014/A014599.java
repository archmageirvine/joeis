package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.a000.A000003;

/**
 * A014599 Class numbers <code>h(D)</code> of imaginary quadratic fields with discriminant <code>D=1-4*n</code>.
 * @author Sean A. Irvine
 */
public class A014599 extends A000003 {

  private long mD = 1;

  @Override
  public Z next() {
    mD -= 4;
    return Z.valueOf(classNumber(mD));
  }
}
