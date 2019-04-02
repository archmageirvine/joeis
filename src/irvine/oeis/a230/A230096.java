package irvine.oeis.a230;

import irvine.oeis.LinearRecurrence;

/**
 * A230096 Number of tilings of an n X 1 rectangle (using tiles of dimension 1 X 1 and 2 X 1) that share no tile at the same position with their mirrored image.
 * @author Sean A. Irvine
 */
public class A230096 extends LinearRecurrence {

  /** Construct the sequence. */
  public A230096() {
    super(new long[] {2, 0, 1, 0}, new long[] {1, 0, 0, 2});
  }
}
