package irvine.oeis.a021;

import irvine.oeis.LinearRecurrence;

/**
 * A021503.
 * @author Sean A. Irvine
 */
public class A021503 extends LinearRecurrence {

  /** Construct the sequence. */
  public A021503() {
    super(new long[] {-144, 234, -107, 18}, new long[] {1, 18, 217, 2214});
  }
}
