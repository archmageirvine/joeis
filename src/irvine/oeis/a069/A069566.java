package irvine.oeis.a069;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A069522.
 * @author Sean A. Irvine
 */
public class A069566 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ZERO;
    }
    int k = 0;
    final StringBuilder forward = new StringBuilder();
    final StringBuilder reverse = new StringBuilder();
    forward.append("1");
    reverse.append("1");
    Z nk = Z.ONE;
    while (true) {
      ++k;
      nk = nk.multiply(mN);
      final String nks = nk.toString();
      final Z t = new Z(forward + nks + reverse);
      if (t.isProbablePrime()) {
        return Z.valueOf(k);
      }
      forward.append(nks);
      reverse.insert(0, nks);
    }
  }
}
