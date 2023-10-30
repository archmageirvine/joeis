package irvine.oeis.a066;

import irvine.math.z.ZUtils;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A066583 Product of nonzero digits of A066551(n).
 * @author Sean A. Irvine
 */
public class A066583 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A066583() {
    super(1, new A066551(), k -> ZUtils.digitNZProduct(k, 10));
  }
}
