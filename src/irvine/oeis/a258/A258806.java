package irvine.oeis.a258;

import irvine.oeis.LinearRecurrence;

/**
 * A258806 <code>a(n) = n^7 + 1</code>.
 * @author Sean A. Irvine
 */
public class A258806 extends LinearRecurrence {

  /** Construct the sequence. */
  public A258806() {
    super(new long[] {-1, 8, -28, 56, -70, 56, -28, 8}, new long[] {1, 2, 129, 2188, 16385, 78126, 279937, 823544});
  }
}
