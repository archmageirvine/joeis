package irvine.oeis.a290;

import irvine.oeis.LinearRecurrence;

/**
 * A290513 Number of irredundant sets in the n-ladder graph.
 * @author Sean A. Irvine
 */
public class A290513 extends LinearRecurrence {

  /** Construct the sequence. */
  public A290513() {
    super(new long[] {-2, -2, -3, -4, -4, -5, -6, -2, 5, 3, 1, 2}, new long[] {3, 11, 26, 79, 224, 640, 1828, 5225, 14928, 42654, 121873, 348232});
  }
}
