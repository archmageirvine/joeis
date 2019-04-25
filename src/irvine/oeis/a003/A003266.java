package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.a000.A000045;

/**
 * A003266 Product of first n nonzero Fibonacci numbers <code>F(1), ..., F(n)</code>.
 * @author Sean A. Irvine
 */
public class A003266 extends A000045 {

  {
    super.next();
  }

  private Z mP = null;

  @Override
  public Z next() {
    mP = mP == null ? Z.ONE : mP.multiply(super.next());
    return mP;
  }
}

