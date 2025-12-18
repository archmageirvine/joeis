package irvine.oeis.a391;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A391273 allocated for Charles L. Hohn.
 * @author Sean A. Irvine
 */
public class A391273 extends Sequence2 {

  private long mN = 1;

  @Override
  public Z next() {
    ++mN;
    long b = 1;
    while (true) {
      if (Predicates.PALINDROME.is(++b, Functions.REVERSE_AND_ADD.z(b, mN))) {
        return Z.valueOf(b);
      }
    }
  }
}
