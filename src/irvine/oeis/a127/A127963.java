package irvine.oeis.a127;

import irvine.math.z.Z;
import irvine.oeis.a000.A000979;

/**
 * A127963 Number of 1's in A127962(n).
 * @author Georg Fischer
 */
public class A127963 extends A000979 {

  @Override
  public Z next() {
    return Z.valueOf(super.next().bitCount());
  }
}
