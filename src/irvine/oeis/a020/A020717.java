package irvine.oeis.a020;

import irvine.oeis.LinearRecurrence;

/**
 * A020717 Pisot sequences L(6,9), E(6,9).
 * @author Sean A. Irvine
 */
public class A020717 extends LinearRecurrence {

  /** Construct the sequence. */
  public A020717() {
    super(new long[] {-1, 0, 2}, new long[] {6, 9, 14});
  }
}
