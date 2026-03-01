package irvine.oeis.a083;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a002.A002385;

/**
 * A083982 Smallest palindromic prime containing the digit string of n.
 * @author Sean A. Irvine
 */
public class A083982 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    final String n = String.valueOf(++mN);
    final Sequence s = new A002385();
    while (true) {
      final Z t = s.next();
      if (t.toString().contains(n)) {
        return t;
      }
    }
  }
}
