package irvine.oeis.a030;

import irvine.oeis.PositionOfNSequence;

/**
 * A030720 <code>a(n)=least</code> k such that <code>s(k)=n</code>, where <code>s=A030717</code>.
 * @author Sean A. Irvine
 */
public class A030720 extends PositionOfNSequence {

  /** Construct the sequence. */
  public A030720() {
    super(new A030717());
  }
}
