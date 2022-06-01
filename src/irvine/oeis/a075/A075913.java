package irvine.oeis.a075;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A075913 Fifth column of triangle A075500.
 * @author Sean A. Irvine
 */
public class A075913 extends LinearRecurrence {

  /** Construct the sequence. */
  public A075913() {
    super(new long[] {375000, -171250, 28125, -2125, 75}, new long[] {1, 75, 3500, 131250, 4344375});
  }
}
