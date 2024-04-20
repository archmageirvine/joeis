package irvine.oeis.a366;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a178.A178248;

/**
 * A366719 Smallest prime dividing 12^n + 1.
 * @author Sean A. Irvine
 */
public class A366719 extends A178248 {

  @Override
  public Z next() {
    return Functions.LPF.z(super.next());
  }
}
