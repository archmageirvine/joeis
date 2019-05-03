package irvine.oeis.a092;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A092662 Absolute value of difference between counts of uninterrupted runs of 9 primes in <code>A092660</code> and <code>A092661</code>.
 * @author Sean A. Irvine
 */
public class A092662 implements Sequence {

  private final A092660 mA = new A092660();
  private final A092661 mB = new A092661();

  @Override
  public Z next() {
    return mA.next().subtract(mB.next()).abs();
  }
}

