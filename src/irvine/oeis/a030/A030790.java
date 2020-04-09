package irvine.oeis.a030;

import irvine.oeis.PositionOfNSequence;

/**
 * A030790 <code>a(n)=least</code> k such that <code>s(k)=n</code>, where <code>s=A030787</code>.
 * @author Sean A. Irvine
 */
public class A030790 extends PositionOfNSequence {

  /** Construct the sequence. */
  public A030790() {
    super(new A030787());
  }
}
