package irvine.oeis.a158;

import irvine.oeis.LinearRecurrence;

/**
 * A158229 <code>225n + 1</code>.
 * @author Sean A. Irvine
 */
public class A158229 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158229() {
    super(new long[] {-1, 2}, new long[] {226, 451});
  }
}
