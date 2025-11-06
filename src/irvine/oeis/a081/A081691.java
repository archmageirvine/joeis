package irvine.oeis.a081;

import irvine.math.z.Z;

/**
 * A081691 From P-positions in a certain game.
 * @author Sean A. Irvine
 */
public class A081691 extends A081690 {

  @Override
  public Z next() {
    super.next();
    return mB.last();
  }
}
