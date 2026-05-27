package irvine.oeis.a085;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a002.A002113;
import irvine.oeis.a002.A002385;

/**
 * A085054 Smallest palindromic prime containing the n-th palindrome.
 * @author Sean A. Irvine
 */
public class A085054 extends A002113 {

  @Override
  public Z next() {
    final Z p = super.next();
    final String s = p.toString();
    final Sequence pp = new A002385();
    while (true) {
      final Z q = pp.next();
      if (q.compareTo(p) >= 0 && q.toString().contains(s)) {
        return q;
      }
    }
  }
}
