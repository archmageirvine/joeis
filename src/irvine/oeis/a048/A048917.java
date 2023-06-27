package irvine.oeis.a048;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A048917 Indices of hexagonal numbers which are also 9-gonal.
 * @author Sean A. Irvine
 */
public class A048917 extends LinearRecurrence {

  /** Construct the sequence. */
  public A048917() {
    super(1, new long[] {1, -1, -64514, 64514, 1}, new long[] {1, 13, 51625, 822757, 3330519121L});
  }
}
