package irvine.oeis.a068;

import irvine.math.z.Z;
import irvine.oeis.PrependSequence;
import irvine.oeis.transform.BoustrophedonTransformSequence;

/**
 * A068718 Boustrophedon transform of A068717 with A068717(1) = -1 instead of 0.
 * @author Sean A. Irvine
 */
public class A068718 extends BoustrophedonTransformSequence {

  /** Construct the sequence. */
  public A068718() {
    super(new PrependSequence(new A068717().skip(), -1));
  }

  @Override
  public Z next() {
    return super.next().negate();
  }
}
