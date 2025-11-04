package irvine.oeis.a389;

import irvine.oeis.DirectSequence;
import irvine.oeis.TwoParameterFormSequence;
import irvine.oeis.a052.A052486;

/**
 * A389959 Powers k^m, m &gt; 0, of Achilles numbers k.
 * @author Sean A. Irvine
 */
public class A389959 extends TwoParameterFormSequence {

  private static final DirectSequence ACHILLES = DirectSequence.create(new A052486());

  /** Construct the sequence. */
  public A389959() {
    super(1, 0, 1, (m, k) -> ACHILLES.a(m.intValue()).pow(k));
  }
}
