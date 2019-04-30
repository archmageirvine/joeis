package irvine.oeis.a000;

import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000454 Unsigned Stirling numbers of first kind <code>s(n,4)</code>.
 * @author Sean A. Irvine
 */
public class A000454 implements Sequence {

  private int mN = 3;

  @Override
  public Z next() {
    return Stirling.firstKind(++mN, 4).abs();
  }
}
