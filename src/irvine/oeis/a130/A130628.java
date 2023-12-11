package irvine.oeis.a130;

import irvine.math.z.Z;
import irvine.oeis.a006.A006207;
import irvine.oeis.transform.MobiusTransformSequence;

/**
 * A130628 Related to the minimal number of periodic orbits of periods guaranteed by Sharkovskii's theorem.
 * @author Sean A. Irvine
 */
public class A130628 extends MobiusTransformSequence {

  /** Construct the sequence. */
  public A130628() {
    super(new A006207.PhinSequence(5), 0);
    super.next();
  }

  private int mN = 0;

  @Override
  public Z next() {
    return super.next().divide(++mN);
  }
}
