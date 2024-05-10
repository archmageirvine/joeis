package irvine.oeis.a069;

import irvine.math.z.Z;

/**
 * A069633 a(1) = 6; a(2n) = smallest prime starting (most significant digits) with a(2n-1). a(2n+1) = smallest prime ending (least significant digits)in a(2n).
 * @author Sean A. Irvine
 */
public class A069633 extends A069628 {

  /** Construct the sequence. */
  public A069633() {
    super(Z.SIX);
  }
}
