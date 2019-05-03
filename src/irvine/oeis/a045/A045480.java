package irvine.oeis.a045;

import irvine.math.z.Z;
import irvine.oeis.a030.A030197;

/**
 * A045480 McKay-Thompson series of class <code>3A</code> for Monster. Expansion of Hauptmodul for <code>X_0^{+}(3)</code>.
 * @author Sean A. Irvine
 */
public class A045480 extends A030197 {

  @Override
  public Z next() {
    final Z a = super.next();
    return mN == 1 ? Z.SIX : a;
  }
}
