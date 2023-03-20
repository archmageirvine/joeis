package irvine.oeis.a355;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A355023 Number of labeled trees on n nodes with maximum degree three and three vertices of degree three.
 * @author Georg Fischer
 */
public class A355023 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A355023() {
    super(8, "[[0],[0,2,-1],[-8,1]]", "[5040]", 0);
  }
}
