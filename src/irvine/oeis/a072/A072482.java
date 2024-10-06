package irvine.oeis.a072;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A072482 Partition the nonnegative integers into minimal groups whose sums are palindromes; this sequence gives the sums.
 * @author Sean A. Irvine
 */
public class A072482 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    long s = 0;
    while (true) {
      s += ++mN;
      if (Predicates.PALINDROME.is(s)) {
        return Z.valueOf(s);
      }
    }
  }
}

