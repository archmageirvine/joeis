package irvine.oeis.a193;

import irvine.math.z.BellNumbers;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A193274 a(n) = binomial(Bell(n), 2) where B(n) = Bell numbers A000110(n).
 * @author Georg Fischer
 */
public class A193274 implements Sequence {

  protected int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Binomial.binomial(BellNumbers.bell(mN), Z.TWO);
  }
}
