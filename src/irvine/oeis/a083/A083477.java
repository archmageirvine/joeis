package irvine.oeis.a083;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a002.A002113;

/**
 * A083477 Smallest palindrome &gt; 1 and == 1 (mod n-th palindrome).
 * @author Sean A. Irvine
 */
public class A083477 extends Sequence1 {

  private final Sequence mPalindromes = new A002113().skip();

  @Override
  public Z next() {
    final Z p = mPalindromes.next();
    if (p.isOne()) {
      return Z.TWO;
    }
    final Sequence s = new A002113().skip(2);
    while (true) {
      final Z q = s.next();
      if (q.mod(p).isOne()) {
        return q;
      }
    }
  }
}
