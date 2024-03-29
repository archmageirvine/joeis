package irvine.oeis.a066;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a005.A005384;

/**
 * A066818 a(n) is the least k such that n + Sum_{i=1..k} A005384(i) is prime; or 0 if none exists.
 * @author Sean A. Irvine
 */
public class A066818 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final Sequence seq = new A005384();
    long k = 0;
    Z sum = Z.valueOf(++mN);
    while (true) {
      ++k;
      sum = sum.add(seq.next());
      if (sum.isProbablePrime()) {
        return Z.valueOf(k);
      }
    }
  }
}

