package irvine.oeis.a026;

import irvine.oeis.PositionOfNSequence;

/**
 * A026367 <code>a(n) =</code> least k such that <code>s(k) =</code> n, where s <code>= A026366</code>.
 * @author Sean A. Irvine
 */
public class A026367 extends PositionOfNSequence {

  /** Construct the sequence. */
  public A026367() {
    super(new A026366());
  }
}
