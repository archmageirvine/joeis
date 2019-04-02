package irvine.oeis.a001;

import irvine.oeis.EulerTransformSequence;
import irvine.oeis.a002.A002862;

/**
 * A001373 Functional digraphs (digraphs of functions on n nodes where every node has outdegree 1 and loops of length 1 are forbidden).
 * @author Sean A. Irvine
 */
public class A001373 extends EulerTransformSequence {

  /** Construct the sequence. */
  public A001373() {
    super(new A002862(), 0);
  }
}
