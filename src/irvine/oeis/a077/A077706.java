package irvine.oeis.a077;

import irvine.math.z.Z;

/**
 * A077706 a(1) = 7; a(n) is the smallest multiple of a(n-1) that contains all the digits of a(n-1) and is not a multiple of 10.
 * @author Sean A. Irvine
 */
public class A077706 extends A077696 {

  /** Construct the sequence. */
  public A077706() {
    super(1, Z.SEVEN);
  }
}
