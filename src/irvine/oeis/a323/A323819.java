package irvine.oeis.a323;
// manually ietman at 2023-02-08 22:11

import irvine.oeis.a055.A055621;
import irvine.oeis.transform.InverseEulerTransform;

/**
 * A323819 Number of non-isomorphic connected set-systems covering n vertices.
 * @author Georg Fischer
 */
public class A323819 extends InverseEulerTransform {

  /** Construct the sequence. */
  public A323819() {
    super(0, new A055621(), 1);
  }
}
