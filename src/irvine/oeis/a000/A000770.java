package irvine.oeis.a000;

import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000770.
 * @author Sean A. Irvine
 */
public class A000770 implements Sequence {

  private int mN = 5;

  @Override
  public Z next() {
    return Stirling.secondKind(++mN, 6);
  }
}
