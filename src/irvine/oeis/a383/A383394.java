package irvine.oeis.a383;

import irvine.oeis.DirectSequence;
import irvine.oeis.TwoParameterFormSequence;
import irvine.oeis.a052.A052486;

/**
 * A383394 Perfect powers of Achilles numbers.
 * @author Sean A. Irvine
 */
public class A383394 extends TwoParameterFormSequence {

  private static final DirectSequence ACHILLES = DirectSequence.create(new A052486());

  /** Construct the sequence. */
  public A383394() {
    super(1, 0, 2, (m, k) -> ACHILLES.a(m.intValue()).pow(k));
  }
}
