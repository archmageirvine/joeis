package irvine.oeis.a038;

import irvine.math.z.Z;
import irvine.oeis.PrependSequence;
import irvine.oeis.WeighTransformSequence;

/**
 * A038084 Number of n-node rooted identity trees of height at most 5.
 * @author Sean A. Irvine
 */
public class A038084 extends WeighTransformSequence {

  /** Construct the sequence. */
  public A038084() {
    super(new PrependSequence(new A038083(), 1));
  }

  @Override
  public Z next() {
    final Z t = super.next();
    return t.isZero() ? null : t;
  }
}
