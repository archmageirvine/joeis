package irvine.oeis.a129;

import irvine.oeis.LinearRecurrence;

/**
 * A129028 <code>A129027(n)/4</code>.
 * @author Sean A. Irvine
 */
public class A129028 extends LinearRecurrence {

  /** Construct the sequence. */
  public A129028() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {0, 27, 150, 483, 1188});
  }
}
