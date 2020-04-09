package irvine.oeis.a026;

import irvine.oeis.PositionOfNSequence;

/**
 * A026371 <code>a(n) =</code> least k such that <code>s(k) =</code> n, where s <code>= A026370</code>.
 * @author Sean A. Irvine
 */
public class A026371 extends PositionOfNSequence {

  /** Construct the sequence. */
  public A026371() {
    super(new A026370());
  }
}
