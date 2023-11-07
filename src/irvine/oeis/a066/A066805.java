package irvine.oeis.a066;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a051.A051349;

/**
 * A066805 a(n) is the least k such that n + Sum_{i=1..k} A018252(i) is prime; or 0 if none exists.
 * @author Sean A. Irvine
 */
public class A066805 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    final Sequence s = new A051349().skip();
    long k = 0;
    while (true) {
      ++k;
      if (s.next().add(mN).isProbablePrime()) {
        return Z.valueOf(k);
      }
    }
  }
}

