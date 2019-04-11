package irvine.oeis.a065;

import irvine.math.z.Z;
import irvine.oeis.a002.A002884;

/**
 * A065128 Number of invertible n X n matrices <code>mod 4</code> (i.e., over the ring Z_4).
 * @author Sean A. Irvine
 */
public class A065128 extends A002884 {

  @Override
  public Z next() {
    return super.next().shiftLeft(mN * mN);
  }
}
