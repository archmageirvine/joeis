package irvine.oeis.a052;

import irvine.oeis.LinearRecurrence;

/**
 * A052255 Partial sums of <code>A050484</code>.
 * @author Sean A. Irvine
 */
public class A052255 extends LinearRecurrence {

  /** Construct the sequence. */
  public A052255() {
    super(new long[] {1, -9, 36, -84, 126, -126, 84, -36, 9}, new long[] {1, 13, 81, 345, 1155, 3267, 8151, 18447, 38610});
  }
}
