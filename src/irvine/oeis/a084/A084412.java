package irvine.oeis.a084;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a002.A002385;

/**
 * A084412 Least palindromic prime that strictly encloses the n-th palindromic prime, or 0 if no such prime exists.
 * @author Sean A. Irvine
 */
public class A084412 extends Sequence1 {

  private final Sequence mP = new A002385();

  @Override
  public Z next() {
    final Z p = mP.next();
    final String s = p.toString();
    final Sequence seq = new A002385();
    final Z min = Z.TEN.pow(s.length() + 1);
    while (true) {
      final Z q = seq.next();
      if (q.compareTo(min) >= 0) {
        final String t = q.toString();
        final int pos = t.indexOf(s);
        if (pos > 0 && pos + s.length() < t.length()) {
          return q;
        }
      }
    }
  }
}
