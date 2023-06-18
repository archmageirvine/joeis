package irvine.oeis.a192;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.a000.A000957;

/**
 * A192675 Floor-Sqrt transform of large Fine numbers (A000957).
 * @author Georg Fischer
 */
public class A192675 extends A000957 {

  @Override
  public Z next() {
    return CR.valueOf(super.next()).sqrt().floor();
  }
}
