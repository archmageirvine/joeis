package irvine.oeis.a077;

import irvine.math.z.Z;

/**
 * A077702 a(1) = 5; a(n) is the smallest multiple of a(n-1) that contains all the digits of a(n-1) and is not a multiple of 10.
 * @author Sean A. Irvine
 */
public class A077702 extends A077696 {

  /** Construct the sequence. */
  public A077702() {
    super(1, Z.FIVE);
  }
}
