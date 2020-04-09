package irvine.oeis.a030;

import irvine.oeis.PositionOfNSequence;

/**
 * A030760 <code>a(n)=least</code> k such that <code>s(k)=n</code>, where <code>s=A030757</code>.
 * @author Sean A. Irvine
 */
public class A030760 extends PositionOfNSequence {

  /** Construct the sequence. */
  public A030760() {
    super(new A030757());
  }
}
