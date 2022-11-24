package irvine.oeis.a060;

import irvine.math.z.Z;
import irvine.oeis.a059.A059990;
import irvine.oeis.transform.MobiusTransformSequence;

/**
 * A060480 Number of orbits of length n in map whose periodic points come from A059990.
 * @author Sean A. Irvine
 */
public class A060480 extends MobiusTransformSequence {

  private long mN = 0;

  /** Construct the sequence. */
  public A060480() {
    super(new A059990(), 0);
    super.next();
  }

  @Override
  public Z next() {
    return super.next().divide(++mN);
  }
}
