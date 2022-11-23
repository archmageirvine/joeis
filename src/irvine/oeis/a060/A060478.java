package irvine.oeis.a060;

import irvine.math.z.Z;
import irvine.oeis.a059.A059928;
import irvine.oeis.transform.MobiusTransformSequence;

/**
 * A060478 Number of orbits of length n in map whose periodic points are A059928.
 * @author Sean A. Irvine
 */
public class A060478 extends MobiusTransformSequence {

  private long mN = 0;

  /** Construct the sequence. */
  public A060478() {
    super(new A059928(), 0);
    super.next();
  }

  @Override
  public Z next() {
    return super.next().divide(++mN);
  }
}
