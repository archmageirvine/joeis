package irvine.oeis.a027;

import irvine.math.z.Z;
import irvine.oeis.a005.A005329;

/**
 * A027639 Order of unitary 2^n X 2^n group H_{n,4} acting on Siegel modular forms.
 * @author Sean A. Irvine
 */
public class A027639 extends A005329 {

  @Override
  public Z next() {
    return super.next().shiftLeft((long) mN * mN + 2L * mN + 2);
  }
}
