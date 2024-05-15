package irvine.oeis.a069;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000290;

/**
 * A069692.
 * @author Sean A. Irvine
 */
public class A069711 extends Sequence1 {

  private final Sequence mSeq = new A000290();

  @Override
  public Z next() {
    while (true) {
      final Z sq = mSeq.next();
      if (Functions.DIGIT_SUM.l(sq) % Functions.DIGIT_LENGTH.l(sq) == 0) {
        return sq;
      }
    }
  }
}
