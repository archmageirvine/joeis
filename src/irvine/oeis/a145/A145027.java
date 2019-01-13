package irvine.oeis.a145;

import irvine.oeis.LinearRecurrence;

/**
 * A145027.
 * @author Sean A. Irvine
 */
public class A145027 extends LinearRecurrence {

  /** Construct the sequence. */
  public A145027() {
    super(new long[] {1, 1, 1}, new long[] {2, 3, 4});
  }
}
