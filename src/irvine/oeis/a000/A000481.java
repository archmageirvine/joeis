package irvine.oeis.a000;

import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000481 Stirling numbers of the second kind, <code>S(n,5)</code>.
 * @author Sean A. Irvine
 */
public class A000481 implements Sequence {

  private int mN = 4;

  @Override
  public Z next() {
    return Stirling.secondKind(++mN, 5);
  }
}
