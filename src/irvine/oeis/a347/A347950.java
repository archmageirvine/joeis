package irvine.oeis.a347;
// manually sumdiv at 2023-04-05 21:35

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A347950 Characteristic function of numbers that have middle divisors.
 * @author Georg Fischer
 */
public class A347950 extends AbstractSequence {

  private int mN = 0;

  /** Construct the sequence. */
  public A347950() {
    super(1);
  }

  @Override
  public Z next() {
    ++mN;
    return Integers.SINGLETON.sumdiv(mN, d -> (Z.valueOf(mN / 2).compareTo(Z.valueOf(d).multiply(d)) < 0
      && Z.valueOf(d).multiply(d).compareTo(Z.valueOf((long) mN << 1)) <= 0) ? Z.ONE : Z.ZERO).isZero() ? Z.ZERO : Z.ONE;
  }
}
