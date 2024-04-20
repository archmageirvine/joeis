package irvine.oeis.a366;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a062.A062394;

/**
 * A366670 Smallest prime dividing 6^n + 1.
 * @author Sean A. Irvine
 */
public class A366670 extends A062394 {

  @Override
  public Z next() {
    return Functions.LPF.z(super.next());
  }
}
