package irvine.oeis.a021;

import irvine.oeis.LinearRecurrence;

/**
 * A021464.
 * @author Sean A. Irvine
 */
public class A021464 extends LinearRecurrence {

  /** Construct the sequence. */
  public A021464() {
    super(new long[] {-150, 245, -113, 19}, new long[] {1, 19, 248, 2810});
  }
}
