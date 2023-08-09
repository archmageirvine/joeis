package irvine.oeis.a065;

import irvine.math.z.Z;
import irvine.oeis.a064.A064492;

/**
 * A065054 Value of remainder r (see A065052) at start of n-th interval between special points in Recam\u00e1n's sequence A005132.
 * @author Sean A. Irvine
 */
public class A065054 extends A064492 {

  @Override
  protected Z select(final Z n, final Z r) {
    return r;
  }
}
