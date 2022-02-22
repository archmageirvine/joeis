package irvine.oeis.a225;

import irvine.math.z.Z;
import irvine.oeis.a000.A000961;

/**
 * A225657 Union of {6} and A000961.
 * @author Georg Fischer
 */
public class A225657 extends A000961 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    if (mN == 6) {
      return Z.SIX;
    }
    return super.next();
  }
}
