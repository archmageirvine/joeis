package irvine.oeis.a115;

import irvine.oeis.FiniteSequence;

/**
 * A115042 Positions of <code>1</code>'s in <code>A094405, "a(n) =</code> sum of all previous terms modulo n, <code>a(1)=1"</code>.
 * @author Georg Fischer
 */
public class A115042 extends FiniteSequence {

  /** Construct the sequence. */
  public A115042() {
    super(1, 2, 18, 24, 35, 40, 252);
  }
}
