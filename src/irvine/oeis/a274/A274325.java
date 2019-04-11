package irvine.oeis.a274;

import irvine.oeis.LinearRecurrence;

/**
 * A274325 Number of partitions of <code>n^5</code> into at most two parts.
 * @author Sean A. Irvine
 */
public class A274325 extends LinearRecurrence {

  /** Construct the sequence. */
  public A274325() {
    super(new long[] {-1, 5, -9, 5, 5, -9, 5}, new long[] {1, 1, 17, 122, 513, 1563, 3889});
  }
}
