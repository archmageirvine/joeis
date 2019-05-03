package irvine.oeis.a052;

import irvine.oeis.LinearRecurrence;

/**
 * A052254 Partial sums of <code>A050406</code>.
 * @author Sean A. Irvine
 */
public class A052254 extends LinearRecurrence {

  /** Construct the sequence. */
  public A052254() {
    super(new long[] {-1, 8, -28, 56, -70, 56, -28, 8}, new long[] {1, 17, 108, 444, 1410, 3762, 8844, 18876});
  }
}
