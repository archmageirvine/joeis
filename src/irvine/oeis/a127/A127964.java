package irvine.oeis.a127;

import irvine.math.z.Z;
import irvine.oeis.a000.A000979;

/**
 * A127964 Number of 0's in the binary expansion of A127962(n).
 * @author Georg Fischer
 */
public class A127964 extends A000979 {

  @Override
  public Z next() {
    final Z term = super.next();
    return Z.valueOf(term.bitLength() - term.bitCount());
  }
}
