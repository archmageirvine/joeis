package irvine.oeis.a122;

import irvine.oeis.LinearRecurrence;

/**
 * A122219 Period <code>9</code>: repeat <code>5, 4, 5, 4, 3, 4, 5, 4, 5</code>.
 * @author Sean A. Irvine
 */
public class A122219 extends LinearRecurrence {

  /** Construct the sequence. */
  public A122219() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {5, 4, 5, 4, 3, 4, 5, 4, 5});
  }
}
