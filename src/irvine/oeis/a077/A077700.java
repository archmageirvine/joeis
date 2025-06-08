package irvine.oeis.a077;

import irvine.math.z.Z;

/**
 * A077700 a(1) = 4; a(n) is the smallest multiple of a(n-1) that contains all the digits of a(n-1) and is not a multiple of 10.
 * @author Sean A. Irvine
 */
public class A077700 extends A077696 {

  /** Construct the sequence. */
  public A077700() {
    super(1, Z.FOUR);
  }
}
