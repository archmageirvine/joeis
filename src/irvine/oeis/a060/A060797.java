package irvine.oeis.a060;

import irvine.math.z.Z;
import irvine.oeis.a002.A002110;

/**
 * A060797 Integer part of square root of n-th primorial, A002110(n).
 * @author Sean A. Irvine
 */
public class A060797 extends A002110 {

  @Override
  public Z next() {
    return super.next().sqrt();
  }
}
