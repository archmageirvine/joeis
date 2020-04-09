package irvine.oeis.a026;

import irvine.oeis.PositionOfNSequence;

/**
 * A026339 <code>a(n) =</code> least k such that <code>s(k) =</code> n, where s <code>= A026338</code>.
 * @author Sean A. Irvine
 */
public class A026339 extends PositionOfNSequence {

  /** Construct the sequence. */
  public A026339() {
    super(new A026338());
  }
}
