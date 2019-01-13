package irvine.oeis.a008;

import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A008278.
 * @author Sean A. Irvine
 */
public class A008278 implements Sequence {

  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    if (--mM <= 0) {
      mM = ++mN;
    }
    return Stirling.secondKind(mN, mM);
  }
}

