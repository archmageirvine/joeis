package irvine.oeis.a087;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a010.A010785;

/**
 * A087402 a(n) is the smallest repdigit &gt; 10 such that Sum_{i=0..n} a(i) is prime.
 * @author Sean A. Irvine
 */
public class A087402 extends Sequence1 {

  private Z mSum = Z.ZERO;

  @Override
  public Z next() {
    final Sequence rep = new A010785().skip(10);
    while (true) {
      final Z r = rep.next();
      final Z t = mSum.add(r);
      if (t.isProbablePrime()) {
        mSum = t;
        return r;
      }
    }
  }
}
