package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041745 Denominators of continued fraction convergents to sqrt(392).
 * @author Sean A. Irvine
 */
public class A041745 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041745() {
    super(new long[] {-1, 0, 0, 0, 198, 0, 0, 0}, new long[] {1, 1, 4, 5, 194, 199, 791, 990});
  }
}
