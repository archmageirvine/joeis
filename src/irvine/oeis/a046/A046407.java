package irvine.oeis.a046;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A046407 Odd numbers with exactly 5 distinct palindromic prime factors.
 * @author Sean A. Irvine
 */
public class A046407 extends Sequence1 {

  private final A046403 mSeq = new A046403();

  @Override
  public Z next() {
    while (true) {
      final Z t = mSeq.next();
      if (t.isOdd()) {
        return t;
      }
    }
  }
}
