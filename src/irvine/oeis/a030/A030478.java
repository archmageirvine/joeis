package irvine.oeis.a030;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A030478 Numbers k such that k^3 has property that all even digits occur together and all odd digits occur together.
 * @author Sean A. Irvine
 */
public class A030478 extends AbstractSequence {

  /** Construct the sequence. */
  public A030478() {
    super(1);
  }

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (!A030475.isMixed(mN.pow(3))) {
        return mN;
      }
    }
  }
}
