package irvine.oeis.a000;

import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000771.
 * @author Sean A. Irvine
 */
public class A000771 implements Sequence {

  private int mN = 6;

  @Override
  public Z next() {
    return Stirling.secondKind(++mN, 7);
  }
}
