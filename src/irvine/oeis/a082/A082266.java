package irvine.oeis.a082;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a002.A002113;

/**
 * A082266 In the array shown below the n-th row contains all the palindromes that use digits &gt; 0 and have a digit sum of n. The sequence contains the array read by rows.
 * @author Sean A. Irvine
 */
public class A082266 extends Sequence1 {

  private long mN = 1;
  private Sequence mP = new A002113();

  @Override
  public Z next() {
    while (true) {
      final Z p = mP.next();
      if (Functions.DIGIT_SUM.l(p) == mN) {
        final int syn = Functions.SYNDROME.i(p);
        if ((syn & 1) == 0) { // i.e., p does not contain any 0's
          if (syn == 2) { // i.e., p is 11...1
            ++mN;
            mP = new A002113();
          }
          return p;
        }
      }
    }
  }
}
