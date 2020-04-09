package irvine.oeis.a030;

import irvine.oeis.PositionOfNSequence;

/**
 * A030770 <code>a(n)=least</code> k such that <code>s(k)=n</code>, where <code>s=A030767</code>.
 * @author Sean A. Irvine
 */
public class A030770 extends PositionOfNSequence {

  /** Construct the sequence. */
  public A030770() {
    super(new A030767());
  }
}
