package irvine.oeis.a046;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;

/**
 * A046449 Smallest composite number with n distinct prime factors with property that the concatenation of its distinct prime factors is a palindrome.
 * @author Sean A. Irvine
 */
public class A046449 extends Sequence1 {

  // Note: this is not very efficient.
  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    final Sequence s = new A046447();
    while (true) {
      final Z t = s.next();
      if (Jaguar.factor(t).omega() == mN) {
        return t;
      }
    }
  }
}
