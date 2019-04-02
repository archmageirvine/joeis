package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.a054.A054639;

/**
 * A014109 Number of possible circular rhymes of n strophes.
 * @author Sean A. Irvine
 */
public class A014109 extends A054639 {

  @Override
  public Z next() {
    final Z r = super.next();
    return Z.SIX.equals(r) ? super.next() : r;
  }
}
