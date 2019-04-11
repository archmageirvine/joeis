package irvine.oeis.a116;

import irvine.oeis.LinearRecurrence;

/**
 * A116810 Number of permutations of length n which avoid the patterns <code>2134, 3241, 4132</code>.
 * @author Sean A. Irvine
 */
public class A116810 extends LinearRecurrence {

  /** Construct the sequence. */
  public A116810() {
    super(new long[] {-1, 12, -62, 182, -337, 412, -337, 182, -62, 12}, new long[] {1, 2, 6, 21, 72, 230, 692, 2004, 5683, 15948});
  }
}
