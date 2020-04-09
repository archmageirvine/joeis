package irvine.oeis.a030;

import irvine.oeis.PositionOfNSequence;

/**
 * A030710 <code>a(n)=least</code> k such that <code>s(k)=n</code>, where <code>s=A030707</code>.
 * @author Sean A. Irvine
 */
public class A030710 extends PositionOfNSequence {

  /** Construct the sequence. */
  public A030710() {
    super(new A030707());
  }
}
