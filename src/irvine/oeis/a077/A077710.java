package irvine.oeis.a077;

import irvine.math.z.Z;

/**
 * A077710 a(1) = 9, a(n)= smallest multiple of a(n-1) that contains all the digits of a(n-1). Or which can be obtained by inserting digits anywhere in a permutation of digits of a(n-1). (prefix,suffix or insertion). a(n)/a(n-1) is not equal to 10^k.
 * @author Sean A. Irvine
 */
public class A077710 extends A077696 {

  /** Construct the sequence. */
  public A077710() {
    super(1, Z.NINE);
  }
}
