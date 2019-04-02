package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042661 Denominators of continued fraction convergents to sqrt(860).
 * @author Sean A. Irvine
 */
public class A042661 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042661() {
    super(new long[] {-1, 0, 0, 0, 7742, 0, 0, 0}, new long[] {1, 3, 43, 132, 7699, 23229, 332905, 1021944});
  }
}
