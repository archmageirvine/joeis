package irvine.oeis.a091;

import irvine.oeis.LinearRecurrence;

/**
 * A091628 Concatenation of <code>n 2</code>'s followed by 3.
 * @author Sean A. Irvine
 */
public class A091628 extends LinearRecurrence {

  /** Construct the sequence. */
  public A091628() {
    super(new long[] {-10, 11}, new long[] {23, 223});
  }
}
