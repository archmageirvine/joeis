package irvine.oeis.a026;

import irvine.oeis.PositionOfNSequence;

/**
 * A026281 <code>a(n) =</code> least k such that <code>s(k) =</code> n, where s <code>= A026280</code>.
 * @author Sean A. Irvine
 */
public class A026281 extends PositionOfNSequence {

  /** Construct the sequence. */
  public A026281() {
    super(new A026280());
  }
}
