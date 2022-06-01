package irvine.oeis.a286;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A286778 Sum of the common path length over all 2-tuples of nodes in a complete binary tree of height n.
 * @author Sean A. Irvine
 */
public class A286778 extends LinearRecurrence {

  /** Construct the sequence. */
  public A286778() {
    super(new long[] {-16, 36, -28, 9}, new long[] {0, 2, 22, 142});
  }
}
