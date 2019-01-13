package irvine.oeis.a065;

import irvine.math.z.Z;
import irvine.oeis.a002.A002884;

/**
 * A065128.
 * @author Sean A. Irvine
 */
public class A065128 extends A002884 {

  @Override
  public Z next() {
    return super.next().shiftLeft(mN * mN);
  }
}
