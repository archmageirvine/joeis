package irvine.oeis.a247;

import irvine.oeis.LinearRecurrence;

/**
 * A247853.
 * @author Sean A. Irvine
 */
public class A247853 extends LinearRecurrence {

  /** Construct the sequence. */
  public A247853() {
    super(new long[] {1, -9, 36, -84, 126, -126, 84, -36, 9}, new long[] {1680, -1648, -880, 36240, 5324432, 52065680, 279702672, 1085747600, 3409634960L});
  }
}
