package irvine.oeis.a014;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.GeneratingFunctionSequence;

/**
 * A014073 Number of vectors abcdefg with a,b,... <code>&gt;= 0, a+...+g=n, a&gt;={b,...g}</code>.
 * @author Sean A. Irvine
 */
public class A014073 extends GeneratingFunctionSequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);

  /** Construct the sequence. */
  public A014073() {
    super(RING.multiply(RING.multiply(Polynomial.create(1, -3, 10, -7, 7, 4, 6, 4, 7, -7, 10, -3, 1),
      RING.onePlusXToTheN(4)),
      RING.onePlusXToTheN(1)),
      RING.multiply(RING.multiply(RING.multiply(RING.multiply(RING.pow(RING.oneMinusXToTheN(1), 3),
        RING.oneMinusXToTheN(4)),
        RING.oneMinusXToTheN(5)),
        RING.oneMinusXToTheN(6)),
        RING.oneMinusXToTheN(7)));
  }
}
