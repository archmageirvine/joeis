package irvine.oeis.a030;

import irvine.oeis.PositionOfNSequence;

/**
 * A030740 <code>a(n)=least</code> k such that <code>s(k)=n</code>, where <code>s=A030737</code>.
 * @author Sean A. Irvine
 */
public class A030740 extends PositionOfNSequence {

  /** Construct the sequence. */
  public A030740() {
    super(new A030737());
  }
}
