package irvine.oeis.a026;

import irvine.oeis.PositionOfNSequence;

/**
 * A026277 <code>a(n) =</code> least k such that <code>s(k) =</code> n, where s <code>= A026276</code>.
 * @author Sean A. Irvine
 */
public class A026277 extends PositionOfNSequence {

  /** Construct the sequence. */
  public A026277() {
    super(new A026276());
  }
}
