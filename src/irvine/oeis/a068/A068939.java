package irvine.oeis.a068;

import irvine.math.z.BellNumbers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A068939 a(n) = Bell(n^2), where Bell(n) are the Bell numbers, cf. A000110.
 * @author Georg Fischer
 */
public class A068939 extends Sequence0 {

  protected int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return BellNumbers.bell(mN * mN);
  }
}
