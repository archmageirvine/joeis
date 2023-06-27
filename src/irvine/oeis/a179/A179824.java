package irvine.oeis.a179;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A179824 Chromatic polynomial of the star graph on 4 vertices (claw graph) and the path graph on 4 vertices.
 * @author Sean A. Irvine
 */
public class A179824 extends LinearRecurrence {

  /** Construct the sequence. */
  public A179824() {
    super(2, new long[] {1, -5, 10, -10, 5}, new long[] {2, 24, 108, 320, 750});
  }
}
