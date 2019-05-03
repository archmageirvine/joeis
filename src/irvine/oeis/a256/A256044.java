package irvine.oeis.a256;

import irvine.oeis.LinearRecurrence;

/**
 * A256044 6th row of array in <code>A099390</code>.
 * @author Sean A. Irvine
 */
public class A256044 extends LinearRecurrence {

  /** Construct the sequence. */
  public A256044() {
    super(new long[] {1, -40, 416, -1224, 1224, -416, 40}, new long[] {1, 13, 281, 6728, 167089, 4213133, 106912793});
  }
}
