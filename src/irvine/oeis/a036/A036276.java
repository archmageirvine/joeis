package irvine.oeis.a036;

import irvine.math.z.Z;
import irvine.oeis.a001.A001864;

/**
 * A036276 a(n) = A001864(n)/2.
 * @author Sean A. Irvine
 */
public class A036276 extends A001864 {

  @Override
  public Z next() {
    return super.next().divide2();
  }
}

