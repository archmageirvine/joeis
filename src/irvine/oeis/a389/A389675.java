package irvine.oeis.a389;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.oeis.a030.A030797;

/**
 * A389675 a(n) = floor(x^n) where x^x = e.
 * @author Sean A. Irvine
 */
public class A389675 extends Sequence0 {

  private static final CR K = new A030797().getCR();
  private long mN = -1;

  @Override
  public Z next() {
    return K.pow(++mN).floor();
  }
}
