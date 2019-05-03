package irvine.oeis.a197;

import irvine.oeis.LinearRecurrence;

/**
 * A197916 Related to the periodic sequence <code>A171654</code>.
 * @author Sean A. Irvine
 */
public class A197916 extends LinearRecurrence {

  /** Construct the sequence. */
  public A197916() {
    super(new long[] {-1, 1, 0, 0, 1}, new long[] {0, 1, 6, 7, 2});
  }
}
