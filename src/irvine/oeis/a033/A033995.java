package irvine.oeis.a033;

import irvine.oeis.a005.A005142;
import irvine.oeis.transform.EulerTransform;

/**
 * A033995 Number of bipartite graphs with n nodes.
 * @author Sean A. Irvine
 */
public class A033995 extends EulerTransform {

  /** Construct the sequence. */
  public A033995() {
    super(0, new A005142().skip(1), 1);
  }
}
