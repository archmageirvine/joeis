package irvine.oeis.a081;

import irvine.math.z.Z;

/**
 * A081695 From P-positions in a certain game. Pile 2 tokens for select function (1+(-)^(y1+1))x1/2.
 * @author Sean A. Irvine
 */
public class A081695 extends A081694 {

  @Override
  public Z next() {
    super.next();
    return mB.last();
  }
}
