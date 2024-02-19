package irvine.oeis.a068;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.PrependSequence;
import irvine.oeis.a031.A031971;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A068445.
 * @author Sean A. Irvine
 */
public class A068477 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A068477() {
    super(0, new PrependSequence(new A031971(), 0), k -> Z.valueOf(ZUtils.digitSum(k)));
  }
}
