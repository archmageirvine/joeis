package irvine.oeis.a144;

import irvine.math.z.BellNumbers;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A144646 a(n) = Bell(n) - 2^n + n.
 * @author Georg Fischer
 */
public class A144646 implements Sequence {

  protected int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return BellNumbers.bell(mN).subtract(Z.ONE.shiftLeft(mN)).add(mN);
  }
}
