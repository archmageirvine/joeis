package irvine.oeis.a087;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a002.A002113;

/**
 * A087386 a(n) = smallest prime == 1 (mod P(n)) where P(n) is the n-th Palindrome.
 * @author Sean A. Irvine
 */
public class A087386 extends Sequence1 {

  private final Sequence mF = new A002113().skip();

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

