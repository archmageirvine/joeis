package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041614 Numerators of continued fraction convergents to sqrt(326).
 * @author Sean A. Irvine
 */
public class A041614 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041614() {
    super(new long[] {-1, 0, 650, 0}, new long[] {18, 325, 11718, 211249});
  }
}
