package irvine.oeis.a085;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a002.A002113;
import irvine.oeis.a056.A056525;

/**
 * A085094 Smallest k such that n*k-1 is a palindrome, or 0 if no such number exists.
 * @author Sean A. Irvine
 */
public class A085094 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    // If 11 | mN, then the palindrome must have odd length
    final Sequence palin = mN % 11 == 0 ? new A056525() : new A002113();
    while (true) {
      final Z p = palin.next();
      if (p.mod(mN) == mN - 1) {
        return p.add(1).divide(mN);
      }
    }
  }
}

