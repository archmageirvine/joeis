package irvine.oeis.a192;

import irvine.oeis.LinearRecurrence;

/**
 * A192872.
 * @author Sean A. Irvine
 */
public class A192872 extends LinearRecurrence {

  /** Construct the sequence. */
  public A192872() {
    super(new long[] {1, -3, 0, 3}, new long[] {1, 0, 3, 4});
  }
}
