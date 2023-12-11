package irvine.oeis.a052;

import irvine.oeis.a001.A001831;
import irvine.oeis.transform.InverseBinomialTransformSequence;

/**
 * A052332 Number of labeled digraphs where every node has indegree 0 or outdegree 0 and no isolated nodes.
 * @author Sean A. Irvine
 */
public class A052332 extends InverseBinomialTransformSequence {

  /** Construct the sequence. */
  public A052332() {
    super(new A001831(), 0);
  }
}
