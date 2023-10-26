package irvine.oeis.a066;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.a000.A000668;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A100960.
 * @author Sean A. Irvine
 */
public class A066538 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A066538() {
    super(1, new A000668(), k -> Z.valueOf(ZUtils.digitSum(k)));
  }
}
