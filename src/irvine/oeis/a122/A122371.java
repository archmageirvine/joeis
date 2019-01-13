package irvine.oeis.a122;

import irvine.oeis.LinearRecurrence;

/**
 * A122371.
 * @author Sean A. Irvine
 */
public class A122371 extends LinearRecurrence {

  /** Construct the sequence. */
  public A122371() {
    super(new long[] {-309, 1157, -1314, 669, -170, 21}, new long[] {1, 6, 41, 285, 1989, 13901});
  }
}
