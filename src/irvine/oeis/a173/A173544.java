package irvine.oeis.a173;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.a002.A002858;

/**
 * A173544 Ulam numbers that are fourth powers.
 * @author Georg Fischer
 */
public class A173544 extends Sequence1 {

  private final A002858 mSeq = new A002858();

  @Override
  public Z next() {
    while (true) {
      final Z result = mSeq.next();
      final Z[] sq = result.sqrtAndRemainder();
      if (sq[1].isZero()) {
        if (sq[0].isSquare()) {
          return result;
        }
      }
    }
  }
}
