package irvine.oeis.a297;
// manually (bisect) 2021-07-05

import irvine.math.z.Z;

/**
 * A297116 Odd bisection of A297115, M\u00f6bius transform of A000120 (binary weight of n).
 * @author Georg Fischer
 */
public class A297116 extends A297115 {
  
  @Override
  public Z next() {
    final Z result = super.next();
    super.next();
    return result;
  }
}
