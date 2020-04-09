package irvine.oeis.a026;

import irvine.oeis.PositionOfNSequence;

/**
 * A026359 <code>a(n) =</code> least k such that <code>s(k) =</code> n, where s <code>= A026358</code>.
 * @author Sean A. Irvine
 */
public class A026359 extends PositionOfNSequence {

  /** Construct the sequence. */
  public A026359() {
    super(new A026358());
  }
}
