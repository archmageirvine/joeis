package irvine.oeis.a073;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000045;

/**
 * A073657 A073656 is the rearrangement of Fibonacci numbers such that sum of two consecutive terms is a prime. This is the sequence of those Fibonacci numbers which retain their relative position in the above rearrangement.
 * @author Sean A. Irvine
 */
public class A073657 extends A073656 {

  private final Sequence mF = new A000045().skip();

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if (t.equals(mF.next())) {
        return t;
      }
    }
  }
}
