package irvine.oeis.a000;

import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000453.
 * @author Sean A. Irvine
 */
public class A000453 implements Sequence {

  private int mN = 3;

  @Override
  public Z next() {
    return Stirling.secondKind(++mN, 4);
  }
}
