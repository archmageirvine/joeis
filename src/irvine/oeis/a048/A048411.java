package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.oeis.a033.A033075;

/**
 * A048411 Squares whose consecutive digits differ by 1.
 * @author Sean A. Irvine
 */
public class A048411 extends A033075 {

  private boolean mFirst = true;

  @Override
  public Z next() {
    if (mFirst) { // all because A033075 does not have 0
      mFirst = false;
      return Z.ZERO;
    }
    while (true) {
      final Z t = super.next();
      if (t.isSquare()) {
        return t;
      }
    }
  }
}
