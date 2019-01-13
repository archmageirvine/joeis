package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016771.
 * @author Sean A. Irvine
 */
public class A016771 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016771() {
    super(new long[] {-1, 8, -28, 56, -70, 56, -28, 8}, new long[] {0, 2187, 279936, 4782969, 35831808, 170859375, 612220032, 1801088541});
  }
}
