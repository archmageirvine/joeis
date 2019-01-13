package irvine.oeis.a092;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A092665.
 * @author Sean A. Irvine
 */
public class A092665 implements Sequence {

  private final A092663 mA = new A092663();
  private final A092664 mB = new A092664();

  @Override
  public Z next() {
    return mA.next().subtract(mB.next()).abs();
  }
}

