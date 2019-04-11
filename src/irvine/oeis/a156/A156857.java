package irvine.oeis.a156;

import irvine.oeis.LinearRecurrence;

/**
 * A156857 Expansion of <code>(1+2x)/(1+x+4x^2)^2</code>.
 * @author Sean A. Irvine
 */
public class A156857 extends LinearRecurrence {

  /** Construct the sequence. */
  public A156857() {
    super(new long[] {-16, -8, -9, -2}, new long[] {1, 0, -9, 10});
  }
}
