package irvine.oeis.a069;

import irvine.math.z.Z;

/**
 * A069630 a(1) = 3; a(2n) = smallest prime starting (most significant digits) with a(2n-1). a(2n+1) = smallest prime ending (least significant digits)in a(2n).
 * @author Sean A. Irvine
 */
public class A069630 extends A069628 {

  /** Construct the sequence. */
  public A069630() {
    super(Z.THREE);
  }
}
