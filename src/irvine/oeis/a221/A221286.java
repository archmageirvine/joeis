package irvine.oeis.a221;

import irvine.oeis.LinearRecurrence;

/**
 * A221286 Vsemirnov's sequence.
 * @author Sean A. Irvine
 */
public class A221286 extends LinearRecurrence {

  /** Construct the sequence. */
  public A221286() {
    super(new long[] {1, 1}, new long[] {106276436867L, 35256392432L});
  }
}
