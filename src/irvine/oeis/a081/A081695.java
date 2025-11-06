package irvine.oeis.a081;

import irvine.math.z.Z;

/**
 * A081695 From P-positions in a certain game.
 * @author Sean A. Irvine
 */
public class A081695 extends A081694 {

  @Override
  public Z next() {
    super.next();
    return mB.last();
  }
}
