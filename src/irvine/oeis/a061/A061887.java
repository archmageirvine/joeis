package irvine.oeis.a061;

import irvine.math.z.Z;
import irvine.oeis.a048.A048760;

/**
 * A061887 n + largest square less than or equal to n; numbers in the range [2k^2,2k^2+2k] for some k.
 * @author Sean A. Irvine
 */
public class A061887 extends A048760 {

  @Override
  public Z next() {
    return super.next().add(mN);
  }
}
