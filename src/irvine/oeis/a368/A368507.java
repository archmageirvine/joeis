package irvine.oeis.a368;

import irvine.oeis.DirectSequence;
import irvine.oeis.TwoParameterFormSequence;
import irvine.oeis.a006.A006939;

/**
 * A080591.
 * @author Sean A. Irvine
 */
public class A368507 extends TwoParameterFormSequence {

  private static final DirectSequence SUPERPRIMORIAL = DirectSequence.forceCreate(0, new A006939());

  /** Construct the sequence. */
  public A368507() {
    super(1, 0, 1, (n, e) -> n > 0 || e == 1 ? SUPERPRIMORIAL.a(n.intValue()).pow(e) : null);
  }
}
