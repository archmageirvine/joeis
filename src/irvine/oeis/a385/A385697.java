package irvine.oeis.a385;

import irvine.oeis.a079.A079564;
import irvine.oeis.transform.EulerTransform;

/**
 * A385697 Number of unlabeled simple graphs on n vertices with no induced subgraphs isomorphic to a P5 or complement of a P5, where P5 = path on 5 vertices.
 * @author Sean A. Irvine
 */
public class A385697 extends EulerTransform {

  /** Construct the sequence. */
  public A385697() {
    super(1, new A079564());
  }
}
