package irvine.oeis.a284;

import irvine.oeis.LinearRecurrence;

/**
 * A284699.
 * @author Sean A. Irvine
 */
public class A284699 extends LinearRecurrence {

  /** Construct the sequence. */
  public A284699() {
    super(new long[] {1, 1, 1, 3, 3}, new long[] {3, 15, 57, 223, 863});
  }
}
