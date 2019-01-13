package irvine.oeis.a229;

import irvine.oeis.LinearRecurrence;

/**
 * A229735.
 * @author Sean A. Irvine
 */
public class A229735 extends LinearRecurrence {

  /** Construct the sequence. */
  public A229735() {
    super(new long[] {-1, 8, -28, 56, -70, 56, -28, 8}, new long[] {0, 1, 70, 1107, 8092, 38165, 135954, 398567});
  }
}
