package irvine.oeis.a164;

import irvine.oeis.LinearRecurrence;

/**
 * A164906 Duplicate of <code>A056450</code>.
 * @author Sean A. Irvine
 */
public class A164906 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164906() {
    super(new long[] {4, 0}, new long[] {1, 4});
  }
}
