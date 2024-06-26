package irvine.oeis.a035;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.a034.A034886;

/**
 * A035067 n! has a palindromic prime number of digits.
 * @author Sean A. Irvine
 */
public class A035067 extends A034886 {

  /** Construct the sequence. */
  public A035067() {
    super(1);
  }

  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final Z t = super.next();
      if (t.isProbablePrime() && Predicates.PALINDROME.is(t)) {
        return Z.valueOf(mN);
      }
    }
  }
}
