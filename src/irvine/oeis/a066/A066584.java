package irvine.oeis.a066;

import irvine.math.z.ZUtils;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A066584 Product of nonzero digits of A066553(n).
 * @author Sean A. Irvine
 */
public class A066584 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A066584() {
    super(1, new A066553(), k -> ZUtils.digitNZProduct(k, 10));
  }
}
