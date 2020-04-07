package irvine.oeis.a026;

import irvine.oeis.PositionOfNSequence;

/**
 * A026273 <code>a(n) =</code> least k such that <code>s(k) =</code> n, where s <code>= A026272</code>.
 * @author Sean A. Irvine
 */
public class A026273 extends PositionOfNSequence {

  /** Construct the sequence. */
  public A026273() {
    super(new A026272());
  }
}
