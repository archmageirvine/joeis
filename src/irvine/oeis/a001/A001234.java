package irvine.oeis.a001;

import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001234 Unsigned Stirling numbers of the first kind <code>s(n,7)</code>.
 * @author Sean A. Irvine
 */
public class A001234 implements Sequence {

  private long mN = 6;

  @Override
  public Z next() {
    return Stirling.firstKind(++mN, 7).abs();
  }
}
