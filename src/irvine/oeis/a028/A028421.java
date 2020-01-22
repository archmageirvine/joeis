package irvine.oeis.a028;

import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A028421.
 * @author Sean A. Irvine
 */
public class A028421 implements Sequence {

  private long mN = 0;
  private long mM = 1;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return Stirling.firstKind(mN, mM).abs().multiply(mM);
  }
}
