package irvine.oeis.a000;

import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000483.
 * @author Sean A. Irvine
 */
public class A000483 implements Sequence {

  private long mN = 5;

  @Override
  public Z next() {
    return Stirling.associatedFirstKind(++mN, 3);
  }
}
