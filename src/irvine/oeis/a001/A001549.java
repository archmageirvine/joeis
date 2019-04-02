package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.a000.A000232;

/**
 * A001549 Related to Gilbreath conjecture.
 * @author Sean A. Irvine
 */
public class A001549 extends A000232 {

  private long mN = 0;
  private Z mP = Z.ZERO;

  @Override
  public Z next() {
    Z v;
    do {
      v = super.next().add(++mN);
    } while (mP.equals(v));
    mP = v;
    return v;
  }
}
