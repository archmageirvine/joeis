package irvine.oeis.a109;

import irvine.oeis.LinearRecurrence;

/**
 * A109220 Expansion of (1+x-x^2)/(1-2x-2x^2+x^4).
 * @author Sean A. Irvine
 */
public class A109220 extends LinearRecurrence {

  /** Construct the sequence. */
  public A109220() {
    super(new long[] {-1, 0, 2, 2}, new long[] {1, 3, 7, 20});
  }
}
