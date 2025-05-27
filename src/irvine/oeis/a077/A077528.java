package irvine.oeis.a077;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence2;
import irvine.oeis.a002.A002113;

/**
 * A077528 a(n) = smallest nontrivial (&gt;1) palindrome == 1 (mod n).
 * @author Sean A. Irvine
 */
public class A077528 extends Sequence2 {

  private long mN = 1;

  @Override
  public Z next() {
    ++mN;
    final Sequence palin = new A002113().skip(2);
    while (true) {
      final Z p = palin.next();
      if (p.mod(mN) == 1) {
        return p;
      }
    }
  }
}
