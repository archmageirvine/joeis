package irvine.oeis.a143;
// manually A323224/arronk

import irvine.math.z.Z;
import irvine.oeis.a323.A323224;

/**
 * A143955 Sum of the altitudes of the leftmost valleys of all Dyck paths of semilength n (if path has no valley, then this altitude is taken to be 0).
 * @author Georg Fischer
 */
public class A143955 extends A323224 {

  private int mN = -3;

  @Override
  public Z next() {
    if (++mN < 0) {
      return Z.ZERO;
    }
    return super.matrixElement(5, mN);
  }
}

