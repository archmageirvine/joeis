package irvine.oeis.a066;

import irvine.math.z.ZUtils;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A066582 Product of nonzero digits of A066549(n).
 * @author Sean A. Irvine
 */
public class A066582 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A066582() {
    super(1, new A066549(), k -> ZUtils.digitNZProduct(k, 10));
  }
}
