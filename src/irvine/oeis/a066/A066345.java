package irvine.oeis.a066;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A066345 Winning binary "same game" templates of length n as defined below.
 * @author Sean A. Irvine
 */
public class A066345 extends LinearRecurrence {

  /** Construct the sequence. */
  public A066345() {
    super(new long[] {-8, 4, 16, -8, -10, 5, 2}, new long[] {1, 1, 4, 7, 20, 39, 96});
  }
}
