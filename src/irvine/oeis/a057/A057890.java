package irvine.oeis.a057;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A057890 In base 2, either a palindrome or becomes a palindrome if trailing 0's are omitted.
 * @author Sean A. Irvine
 */
public class A057890 extends Sequence1 {

  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      if (Predicates.PALINDROME.is(2, ++mN)) {
        return Z.valueOf(mN);
      }
      long m = mN;
      while ((m & 1) == 0) {
        m >>>= 1;
      }
      if (Predicates.PALINDROME.is(2, m)) {
        return Z.valueOf(mN);
      }
    }
  }
}

