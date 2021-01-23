package irvine.oeis.a109;

import irvine.oeis.LinearRecurrence;

/**
 * A109609 Expansion of 1/((x-1)*(x+1)*(x^2+x+1)*(x^2+x-1)*(x^2-x+1)*(x^2+1)*(x^4-x^2+1)).
 * @author Sean A. Irvine
 */
public class A109609 extends LinearRecurrence {

  /** Construct the sequence. */
  public A109609() {
    super(new long[] {-1, -1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1}, new long[] {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 234, 378});
  }
}
