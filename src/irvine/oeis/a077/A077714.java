package irvine.oeis.a077;

import irvine.math.z.Z;

/**
 * A077714 a(1) = 1; thereafter a(n) = the smallest prime of the form d0...0a(n-1), where d is a single digit, or 0 if no such prime exists.
 * @author Sean A. Irvine
 */
public class A077714 extends A077713 {

  /** Construct the sequence. */
  public A077714() {
    super(Z.ONE);
  }
}
