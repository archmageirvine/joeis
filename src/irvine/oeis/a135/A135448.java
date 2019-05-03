package irvine.oeis.a135;

import irvine.oeis.LinearRecurrence;

/**
 * A135448 Period <code>5</code>: repeat <code>[1, 5, 3, 4, -2]</code>.
 * @author Sean A. Irvine
 */
public class A135448 extends LinearRecurrence {

  /** Construct the sequence. */
  public A135448() {
    super(new long[] {1, 0, 0, 0, 0}, new long[] {1, 5, 3, 4, -2});
  }
}
