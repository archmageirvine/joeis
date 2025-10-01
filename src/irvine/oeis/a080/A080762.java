package irvine.oeis.a080;

import irvine.math.z.Z;
import irvine.oeis.ComplementSequence;
import irvine.oeis.Conjectural;

/**
 * A080762 Positive numbers not of the form y^2 - x^3, x and y &gt;= 1.
 * @author Sean A. Irvine
 */
public class A080762 extends ComplementSequence implements Conjectural {

  // Conjectural because A080761 is conjectural

  /** Construct the sequence. */
  public A080762() {
    super(1, Z.ONE, new A080761());
  }
}
