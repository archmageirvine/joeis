package irvine.oeis.a075;

import irvine.math.z.Z;
import irvine.oeis.a002.A002277;

/**
 * A075412 Squares of A002277.
 * @author Sean A. Irvine
 */
public class A075412 extends A002277 {

  @Override
  public Z next() {
    return super.next().square();
  }
}
