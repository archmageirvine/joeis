package irvine.oeis.a001;

import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001233 Unsigned Stirling numbers of first kind <code>s(n,6)</code>.
 * @author Sean A. Irvine
 */
public class A001233 implements Sequence {

  private long mN = 5;

  @Override
  public Z next() {
    return Stirling.firstKind(++mN, 6).abs();
  }
}
