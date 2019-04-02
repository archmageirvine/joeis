package irvine.oeis.a000;

import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000276 Associated Stirling numbers.
 * @author Sean A. Irvine
 */
public class A000276 implements Sequence {

  private int mN = 3;

  @Override
  public Z next() {
    return Stirling.associatedFirstKind(++mN, 2);
  }
}
