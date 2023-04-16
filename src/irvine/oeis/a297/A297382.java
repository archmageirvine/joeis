package irvine.oeis.a297;

import irvine.math.z.Z;
import irvine.oeis.a023.A023900;

/**
 * A297382 Denominator of -A023900(n)/2.
 * @author Georg Fischer
 */
public class A297382 extends A023900 {

  @Override
  public Z next() {
    return super.next().isEven() ? Z.ONE : Z.TWO;
  }
}
