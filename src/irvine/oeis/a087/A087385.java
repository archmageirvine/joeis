package irvine.oeis.a087;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000217;

/**
 * A087385 a(n) = smallest prime == 1 (mod T(n)) where T(n) is the n-th triangular number (A000217).
 * @author Sean A. Irvine
 */
public class A087385 extends Sequence1 {

  private final Sequence mF = new A000217().skip();

  @Override
  public Z next() {
    final Z m = mF.next();
    Z t = m.add(1);
    while (!t.isProbablePrime()) {
      t = t.add(m);
    }
    return t;
  }
}

