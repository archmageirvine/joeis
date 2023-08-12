package irvine.oeis.a065;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A065081 Alternating bit sum (A065359) for n-th prime p: replace 2^k with (-1)^k in binary expansion of p.
 * @author Sean A. Irvine
 */
public class A065081 extends A000040 {

  @Override
  public Z next() {
    return Z.valueOf(A065079.alternatingBitSum(super.next()));
  }
}

