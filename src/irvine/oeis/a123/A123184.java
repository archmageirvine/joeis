package irvine.oeis.a123;

import irvine.oeis.LinearRecurrence;

/**
 * A123184.
 * @author Sean A. Irvine
 */
public class A123184 extends LinearRecurrence {

  /** Construct the sequence. */
  public A123184() {
    super(new long[] {-1, 4, 24, -39, 13}, new long[] {1, 1, 3, 15, 103});
  }
}
