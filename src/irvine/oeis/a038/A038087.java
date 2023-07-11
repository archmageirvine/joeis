package irvine.oeis.a038;

import irvine.math.z.Z;
import irvine.oeis.PrependSequence;
import irvine.oeis.transform.WeighTransformSequence;

/**
 * A038087 Number of n-node rooted identity trees of height at most 8.
 * @author Sean A. Irvine
 */
public class A038087 extends WeighTransformSequence {

  /** Construct the sequence. */
  public A038087() {
    super(1, new PrependSequence(new A038086(), 1));
  }

  @Override
  public Z next() {
    final Z t = super.next();
    return t.isZero() ? null : t;
  }
}
