package irvine.oeis.a092;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A092659.
 * @author Sean A. Irvine
 */
public class A092659 implements Sequence {

  private final A092657 mA = new A092657();
  private final A092658 mB = new A092658();

  @Override
  public Z next() {
    return mA.next().subtract(mB.next()).abs();
  }
}

