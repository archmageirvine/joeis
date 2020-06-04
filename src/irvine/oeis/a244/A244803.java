package irvine.oeis.a244;

import irvine.oeis.LinearRecurrence;

/**
 * A244803 The <code>360\u00ba</code> spoke (or ray) of a hexagonal spiral of Ulam.
 * @author Sean A. Irvine
 */
public class A244803 extends LinearRecurrence {

  /** Construct the sequence. */
  public A244803() {
    super(new long[] {1, -3, 3}, new long[] {1, 12, 47});
  }
}
