package irvine.oeis.a048;

import irvine.math.z.Z;

/**
 * A048735 a(n) = (n AND floor(n/2)), where AND is bitwise and-operator (A004198).
 * @author Sean A. Irvine
 */
public class A048735 extends A048728 {

  @Override
  public Z next() {
    return super.next().shiftRight(2);
  }
}
