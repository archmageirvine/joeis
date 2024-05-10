package irvine.oeis.a046;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A046375 Odd numbers with exactly 5 palindromic prime factors (counted with multiplicity).
 * @author Sean A. Irvine
 */
public class A046375 extends Sequence1 {

  private final A046371 mSeq = new A046371();

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
