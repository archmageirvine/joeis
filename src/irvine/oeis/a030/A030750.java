package irvine.oeis.a030;

import irvine.oeis.PositionOfNSequence;

/**
 * A030750 <code>a(n)=least</code> k such that <code>s(k)=n</code>, where <code>s=A030747</code>.
 * @author Sean A. Irvine
 */
public class A030750 extends PositionOfNSequence {

  /** Construct the sequence. */
  public A030750() {
    super(new A030747());
  }
}
