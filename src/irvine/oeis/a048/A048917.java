package irvine.oeis.a048;

import irvine.oeis.LinearRecurrence;

/**
 * A048917 Indices of hexagonal numbers which are also <code>9-gonal</code>.
 * @author Sean A. Irvine
 */
public class A048917 extends LinearRecurrence {

  /** Construct the sequence. */
  public A048917() {
    super(new long[] {1, -1, -64514, 64514, 1}, new long[] {1, 13, 51625, 822757, 3330519121L});
  }
}
