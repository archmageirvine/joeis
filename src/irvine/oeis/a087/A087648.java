package irvine.oeis.a087;

import irvine.math.z.BellNumbers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A087648 a(n) = (1/2)*(Bell(n+2)+Bell(n+1)-Bell(n)).
 * @author Georg Fischer
 */
public class A087648 extends Sequence0 {

  protected int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return BellNumbers.bell(mN + 2).add(BellNumbers.bell(mN + 1))
      .subtract(BellNumbers.bell(mN)).divide2();
  }
}
