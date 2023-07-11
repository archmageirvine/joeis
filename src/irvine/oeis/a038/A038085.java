package irvine.oeis.a038;

import irvine.math.z.Z;
import irvine.oeis.PrependSequence;
import irvine.oeis.transform.WeighTransformSequence;

/**
 * A038085 Number of n-node rooted identity trees of height at most 6.
 * @author Sean A. Irvine
 */
public class A038085 extends WeighTransformSequence {

  /** Construct the sequence. */
  public A038085() {
    super(1, new PrependSequence(new A038084(), 1));
  }

  @Override
  public Z next() {
    final Z t = super.next();
    return t.isZero() ? null : t;
  }
}
