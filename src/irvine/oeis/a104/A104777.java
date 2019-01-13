package irvine.oeis.a104;

import irvine.oeis.LinearRecurrence;

/**
 * A104777.
 * @author Sean A. Irvine
 */
public class A104777 extends LinearRecurrence {

  /** Construct the sequence. */
  public A104777() {
    super(new long[] {1, -1, -2, 2, 1}, new long[] {1, 25, 49, 121, 169});
  }
}
