package irvine.oeis.a000;

import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000482 Unsigned Stirling numbers of first kind <code>s(n,5)</code>.
 * @author Sean A. Irvine
 */
public class A000482 implements Sequence {

  private int mN = 4;

  @Override
  public Z next() {
    return Stirling.firstKind(++mN, 5).abs();
  }
}
