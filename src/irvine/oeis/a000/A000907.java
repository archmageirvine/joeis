package irvine.oeis.a000;

import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000907.
 * @author Sean A. Irvine
 */
public class A000907 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    return Stirling.associatedFirstKind(2 * mN + 2, mN);
  }
}

