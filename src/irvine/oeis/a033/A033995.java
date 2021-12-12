package irvine.oeis.a033;

import irvine.oeis.transform.EulerTransformSequence;
import irvine.oeis.a005.A005142;

/**
 * A033995 Number of bipartite graphs with n nodes.
 * @author Sean A. Irvine
 */
public class A033995 extends EulerTransformSequence {

  /** Construct the sequence. */
  public A033995() {
    super(new A005142(), 1);
  }
}
