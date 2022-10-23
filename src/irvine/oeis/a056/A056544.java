package irvine.oeis.a056;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a002.A002113;

/**
 * A056544 Smallest palindrome containing the digits of n as a subsequence.
 * @author Sean A. Irvine
 */
public class A056544 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final String s = String.valueOf(++mN);
    final Sequence palin = new A002113();
    while (true) {
      final Z p = palin.next();
      if (p.toString().contains(s)) {
        return p;
      }
    }
  }
}
