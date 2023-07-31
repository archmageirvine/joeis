package irvine.oeis.a064;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A064892 "Binary potency" of n-th prime p: length of shortest blocks of 0's inserted between the bits of p required to "dilute" it into a nonprime.
 * @author Sean A. Irvine
 */
public class A064892 extends A000040 {

  @Override
  public Z next() {
    return Z.valueOf(A064891.computePotency(super.next().longValueExact()));
  }
}

