package irvine.oeis.a121;

import irvine.math.z.BellNumbers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A121292 a(n) = Bell(3*n+1).
 * @author Georg Fischer
 */
public class A121292 extends Sequence0 {

  protected int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return BellNumbers.bell(3 * mN + 1);
  }
}
