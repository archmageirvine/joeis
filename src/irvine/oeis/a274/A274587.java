package irvine.oeis.a274;

import irvine.oeis.LinearRecurrence;

/**
 * A274587.
 * @author Sean A. Irvine
 */
public class A274587 extends LinearRecurrence {

  /** Construct the sequence. */
  public A274587() {
    super(new long[] {1, -35, 1189, -40391, 40391, -1189, 35}, new long[] {1, 23, 176, 5968, 888778, 30192278, 233944673});
  }
}
