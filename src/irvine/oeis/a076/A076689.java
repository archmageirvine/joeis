package irvine.oeis.a076;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a002.A002110;

/**
 * A076600.
 * @author Sean A. Irvine
 */
public class A076689 extends Sequence1 {

  private final Sequence mPrimorials = new A002110().skip();

  @Override
  public Z next() {
    final Z pr = mPrimorials.next();
    Z s = Z.ONE;
    long k = 0;
    while (true) {
      ++k;
      s = s.add(pr);
      if (s.isProbablePrime()) {
        return Z.valueOf(k);
      }
    }
  }
}
