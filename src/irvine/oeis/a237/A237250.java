package irvine.oeis.a237;

import irvine.oeis.LinearRecurrence;

/**
 * A237250.
 * @author Sean A. Irvine
 */
public class A237250 extends LinearRecurrence {

  /** Construct the sequence. */
  public A237250() {
    super(new long[] {-1, 0, 4, 0}, new long[] {2, 3, 5, 10});
  }
}
