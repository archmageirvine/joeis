package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A005574 Numbers k such that k^2 + 1 is prime.
 * @author Sean A. Irvine
 */
public class A005574 extends AbstractSequence {

  /** Construct the sequence. */
  public A005574() {
    super(1);
  }

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (mN.square().add(1).isProbablePrime()) {
        return mN;
      }
    }
  }
}

