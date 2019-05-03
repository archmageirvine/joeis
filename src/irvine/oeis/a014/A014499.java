package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A014499 Number of <code>1</code>'s in binary representation of n-th prime.
 * @author Sean A. Irvine
 */
public class A014499 extends A000040 {

  @Override
  public Z next() {
    return Z.valueOf(super.next().bitCount());
  }
}
