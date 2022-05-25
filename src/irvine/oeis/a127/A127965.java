package irvine.oeis.a127;

import irvine.math.z.Z;
import irvine.oeis.a000.A000979;

/**
 * A127965 Number of bits in A127962(n).
 * @author Georg Fischer
 */
public class A127965 extends A000979 {

  @Override
  public Z next() {
    return Z.valueOf(super.next().bitLength());
  }
}
