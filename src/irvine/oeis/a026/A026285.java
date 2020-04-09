package irvine.oeis.a026;

import irvine.oeis.PositionOfNSequence;

/**
 * A026285 <code>a(n) =</code> least k such that <code>s(k) =</code> n, where s <code>= A026284</code>.
 * @author Sean A. Irvine
 */
public class A026285 extends PositionOfNSequence {

  /** Construct the sequence. */
  public A026285() {
    super(new A026284());
  }
}
