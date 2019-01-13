package irvine.oeis.a271;

import irvine.oeis.LinearRecurrence;

/**
 * A271508.
 * @author Sean A. Irvine
 */
public class A271508 extends LinearRecurrence {

  /** Construct the sequence. */
  public A271508() {
    super(new long[] {-1, 1, 1}, new long[] {1, 4, 11});
  }
}
