package irvine.oeis.a156;

import irvine.oeis.LinearRecurrence;

/**
 * A156376.
 * @author Sean A. Irvine
 */
public class A156376 extends LinearRecurrence {

  /** Construct the sequence. */
  public A156376() {
    super(new long[] {-1, 2}, new long[] {19, 49});
  }
}
