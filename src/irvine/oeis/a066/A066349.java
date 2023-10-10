package irvine.oeis.a066;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A066349 A self-generating sequence: let S = {}, a(0) = 333; for n &gt;= 1, factorize a(n-1), arrange prime factors in increasing order and append their digits to S; then a(n) is the 3-digit number formed from terms 3n, 3n+1, 3n+2 of S. Leading zeros are omitted from a(n).
 * @author Sean A. Irvine
 */
public class A066349 extends Sequence0 {

  private static final long[] SMALL = {333, 735, 775, 531};
  private final StringBuilder mS = new StringBuilder();
  private int mSmallPos = 0;

  @Override
  public Z next() {
    final long v;
    if (mS.length() <= 3) {
      v = SMALL[mSmallPos++];
    } else {
      v = (mS.charAt(0) - '0') * 100 + (mS.charAt(1) - '0') * 10 + mS.charAt(2) - '0';
    }
    final FactorSequence fs = Jaguar.factor(v);
    for (final Z p : fs.toZArray()) {
      mS.append(String.valueOf(p).repeat(fs.getExponent(p)));
    }
    mS.delete(0, 3);
    return Z.valueOf(v);
  }
}
