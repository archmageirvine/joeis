package irvine.oeis.a077;

import irvine.math.z.Z;

/**
 * A077698 a(1) = 3, a(n) is the smallest multiple of a(n-1) that contains all the digits of a(n-1), or which can be obtained by inserting digits anywhere in a permutation of digits of a(n-1) (prefix, suffix or insertion). Zeros are not to be suffixed. a(n) is not divisible by 10.
 * @author Sean A. Irvine
 */
public class A077698 extends A077696 {

  /** Construct the sequence. */
  public A077698() {
    super(1, Z.THREE);
  }
}
