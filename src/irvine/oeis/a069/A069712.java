package irvine.oeis.a069;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a000.A000217;

/**
 * A069692.
 * @author Sean A. Irvine
 */
public class A069712 extends Sequence0 {

  private final Sequence mSeq = new A000217().skip();

  @Override
  public Z next() {
    while (true) {
      final Z tri = mSeq.next();
      if (Functions.DIGIT_SUM.l(tri) % Functions.DIGIT_LENGTH.l(tri) == 0) {
        return tri;
      }
    }
  }
}
