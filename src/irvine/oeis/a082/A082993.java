package irvine.oeis.a082;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A082993 a(1) = 2; a(n+1) = least prime &gt; a(1)*a(2)*...*a(n).
 * @author Sean A. Irvine
 */
public class A082993 extends Sequence1 {

  private Z mA = Z.ONE;

  @Override
  public Z next() {
    final Z res = Functions.NEXT_PRIME.z(mA);
    mA = mA.multiply(res);
    return res;
  }
}
