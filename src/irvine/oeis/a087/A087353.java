package irvine.oeis.a087;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A087353 Primes arising in A087352.
 * @author Sean A. Irvine
 */
public class A087353 extends Sequence1 {

  private Z mA = Z.ONE;
  private String mConcat = "1";

  @Override
  public Z next() {
    Z t = Functions.SQRT.z(mA);
    while (true) {
      t = t.add(1);
      final Z sq = t.square();
      final String v = mConcat + sq;
      final Z u = new Z(v);
      if (u.isProbablePrime()) {
        mConcat = v;
        mA = sq;
        return u;
      }
    }
  }
}
