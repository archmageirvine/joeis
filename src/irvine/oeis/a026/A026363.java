package irvine.oeis.a026;

import irvine.oeis.PositionOfNSequence;

/**
 * A026363 <code>a(n) =</code> least k such that <code>s(k) =</code> n, where s <code>= A026362</code>.
 * @author Sean A. Irvine
 */
public class A026363 extends PositionOfNSequence {

  /** Construct the sequence. */
  public A026363() {
    super(new A026362());
  }
}
