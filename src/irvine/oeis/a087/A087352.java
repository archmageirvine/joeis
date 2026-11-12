package irvine.oeis.a087;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A087352 a(n+1) is the smallest square &gt; a(n) such that every concatenation (n &gt; 1) is a prime.
 * @author Sean A. Irvine
 */
public class A087352 extends Sequence1 {

  private Z mA = null;
  private String mConcat = "1";

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ONE;
      return Z.ONE;
    }
    Z t = Functions.SQRT.z(mA);
    while (true) {
      t = t.add(1);
      final Z sq = t.square();
      final String v = mConcat + sq;
      final Z u = new Z(v);
      if (u.isProbablePrime()) {
        mConcat = v;
        mA = sq;
        return sq;
      }
    }
  }
}
