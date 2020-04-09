package irvine.oeis.a026;

import irvine.oeis.PositionOfNSequence;

/**
 * A026347 <code>a(n) =</code> least k such that <code>s(k) =</code> n, where s <code>= A026346</code>.
 * @author Sean A. Irvine
 */
public class A026347 extends PositionOfNSequence {

  /** Construct the sequence. */
  public A026347() {
    super(new A026346());
  }
}
