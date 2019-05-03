package irvine.oeis.a037;

import irvine.math.z.Z;
import irvine.oeis.a000.A000165;

/**
 * A037223 Number of solutions to non-attacking rooks problem on <code>n X n</code> board that are invariant under 180-degree rotation.
 * @author Sean A. Irvine
 */
public class A037223 extends A000165 {

  private Z mT = null;

  @Override
  public Z next() {
    if (mT == null) {
      mT = super.next();
      return mT;
    } else {
      final Z t = mT;
      mT = null;
      return t;
    }
  }
}
