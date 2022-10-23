package irvine.oeis.a002;

import irvine.math.cr.CR;
import irvine.math.cr.Convergents;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A002486 Apart from two leading terms (which are present by convention), denominators of convergents to Pi (A002485 and A046947 give numerators).
 * @author Sean A. Irvine
 */
public class A002486 extends Sequence0 {

  private final Convergents mC = new Convergents(CR.PI);
  private long mN = 2;

  @Override
  public Z next() {
    if (mN > 0) {
      return Z.valueOf(--mN);
    }
    return mC.next().den();
  }
}
