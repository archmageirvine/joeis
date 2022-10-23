package irvine.oeis.a051;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A051191 a(n) = 2^(2^n-2).
 * @author Sean A. Irvine
 */
public class A051191 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    return Z.ONE.shiftLeft((1 << ++mN) - 2);
  }
}
