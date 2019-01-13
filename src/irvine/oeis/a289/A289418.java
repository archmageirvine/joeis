package irvine.oeis.a289;

import irvine.oeis.LinearRecurrence;

/**
 * A289418.
 * @author Sean A. Irvine
 */
public class A289418 extends LinearRecurrence {

  /** Construct the sequence. */
  public A289418() {
    super(new long[] {3, -22, 40, -29, 9}, new long[] {1, 9, 52, 247, 1053});
  }
}
