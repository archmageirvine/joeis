package irvine.oeis.a027;

import irvine.math.z.Z;
import irvine.oeis.a003.A003956;

/**
 * A027638 Order of 2^n X 2^n unitary group H_n acting on Siegel modular forms.
 * @author Sean A. Irvine
 */
public class A027638 extends A003956 {

  @Override
  public Z next() {
    return super.next().divide2();
  }
}
