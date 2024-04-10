package irvine.oeis.a069;

import irvine.math.z.Z;
import irvine.oeis.a000.A000792;
import irvine.oeis.a001.A001414;

/**
 * A069188 Look at all numbers formed by multiplying the parts in a partition of n; a(n) = maximal such number which is divisible by n.
 * @author Sean A. Irvine
 */
public class A069188 extends A001414 {

  private final A000792 mSeq = new A000792();

  @Override
  public Z next() {
    final Z t = super.next();
    return mSeq.a((int) mN - t.intValueExact()).multiply(mN);
  }
}

