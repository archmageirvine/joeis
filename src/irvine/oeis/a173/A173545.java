package irvine.oeis.a173;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.a002.A002858;

/**
 * A173545 Ulam numbers that are perfect squares.
 * @author Georg Fischer
 */
public class A173545 extends Sequence1 {

  private final A002858 mSeq = new A002858();

  @Override
  public Z next() {
    while (true) {
      final Z result = mSeq.next();
      if (result.isSquare()) {
        return result;
      }
    }
  }
}
