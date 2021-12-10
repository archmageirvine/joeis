package irvine.oeis.a038;

import irvine.math.z.Z;
import irvine.oeis.PrependSequence;
import irvine.oeis.transform.WeighTransformSequence;

/**
 * A038083 Number of n-node rooted identity trees of height at most 4.
 * @author Sean A. Irvine
 */
public class A038083 extends WeighTransformSequence {

  /** Construct the sequence. */
  public A038083() {
    super(new PrependSequence(new A038082(), 1));
  }

  @Override
  public Z next() {
    final Z t = super.next();
    return t.isZero() ? null : t;
  }
}
