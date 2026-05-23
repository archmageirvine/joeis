package irvine.oeis.a084;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000040;
import irvine.oeis.a000.A000142;

/**
 * A084966 Minimum numbers of squares needed to write n! as a sum of nonzero squares.
 * @author Sean A. Irvine
 */
public class A084966 extends A000040 {

  private final Sequence mF = new A000142().skip();

  @Override
  public Z next() {
    final Z f = mF.next();
    if (Predicates.SQUARE.is(f)) {
      return Z.ONE;
    }
    if (Predicates.SUM_OF_2_SQUARES.is(f)) {
      return Z.TWO;
    }
    if (Predicates.SUM_OF_3_SQUARES.is(f)) {
      return Z.THREE;
    }
    if (Predicates.SUM_OF_4_SQUARES.is(f)) {
      return Z.FOUR;
    }
    throw new UnsupportedOperationException();
  }
}
