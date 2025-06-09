package irvine.oeis.a077;

import irvine.math.z.Z;

/**
 * A077716 a(1) = 19; thereafter a(n) = the smallest prime of the form d0...0a(n-1), where d is a single digit, or 0 if no such prime exists.
 * @author Sean A. Irvine
 */
public class A077716 extends A077713 {

  /** Construct the sequence. */
  public A077716() {
    super(Z.valueOf(19));
  }
}
