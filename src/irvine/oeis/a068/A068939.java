package irvine.oeis.a068;

import irvine.math.z.BellNumbers;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A068939 a(n) = Bell(n^2), where Bell(n) are the Bell numbers, cf. A000110.
 * @author Georg Fischer
 */
public class A068939 implements Sequence {

  protected int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return BellNumbers.bell(mN * mN);
  }
}
