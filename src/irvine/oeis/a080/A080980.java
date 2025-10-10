package irvine.oeis.a080;

import irvine.oeis.DistinctSequence;

/**
 * A080980 A014486-indices of the trees whose interior zigzag-tree (Stanley's c) is branch-reduced (in the sense defined by Donaghey).
 * @author Sean A. Irvine
 */
public class A080980 extends DistinctSequence {

  /** Construct the sequence. */
  public A080980() {
    super(0, new A080979());
  }
}

