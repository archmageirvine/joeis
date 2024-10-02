package irvine.oeis.a072;

import irvine.oeis.transform.LogarithmicTransformSequence;

/**
 * A072447 Number of connectedness systems on n vertices that contain all singletons and the set of all the vertices.
 * @author Sean A. Irvine
 */
public class A072447 extends LogarithmicTransformSequence {

  /** Construct the sequence. */
  public A072447() {
    super(1, new A072446(), 1);
  }
}

