package irvine.oeis.a038;

import irvine.oeis.LinearRecurrence;

/**
 * A038867.
 * @author Sean A. Irvine
 */
public class A038867 extends LinearRecurrence {

  /** Construct the sequence. */
  public A038867() {
    super(new long[] {1, -3, 3}, new long[] {125, 215, 335});
  }
}
