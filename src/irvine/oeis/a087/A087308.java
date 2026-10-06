package irvine.oeis.a087;

import irvine.math.z.Z;
import irvine.oeis.a086.A086786;

/**
 * A087308 Initial terms associated with the arithmetic progressions in A086786.
 * @author Sean A. Irvine
 */
public class A087308 extends A086786 {

  @Override
  public Z next() {
    mRow.clear();
    step();
    return Z.valueOf(mRow.peekFirst());
  }
}
