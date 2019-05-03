package irvine.oeis.a254;

import irvine.oeis.LinearRecurrence;

/**
 * A254857 Octagonal numbers <code>(A000567)</code> that are also centered heptagonal numbers <code>(A069099)</code>.
 * @author Sean A. Irvine
 */
public class A254857 extends LinearRecurrence {

  /** Construct the sequence. */
  public A254857() {
    super(new long[] {1, -1, -674, 674, 1}, new long[] {1, 8, 736, 5461, 496133});
  }
}
