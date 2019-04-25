package irvine.oeis.a122;

import irvine.oeis.LinearRecurrence;

/**
 * A122219 Period 9: repeat 5, 4, 5, 4, 3, 4, 5, 4, 5.
 * @author Sean A. Irvine
 */
public class A122219 extends LinearRecurrence {

  /** Construct the sequence. */
  public A122219() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {5, 4, 5, 4, 3, 4, 5, 4, 5});
  }
}
