package irvine.oeis.a082;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a002.A002385;

/**
 * A082769 a(n) = smallest palindromic prime that begins with A082768(n), or 0 if no such number exists.
 * @author Sean A. Irvine
 */
public class A082769 extends A082768 {

  @Override
  public Z next() {
    final String s = super.next().toString();
    final Sequence seq = new A002385();
    while (true) {
      final Z p = seq.next();
      if (p.toString().startsWith(s)) {
        return p;
      }
    }
  }
}
