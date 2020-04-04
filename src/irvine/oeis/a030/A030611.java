package irvine.oeis.a030;

import irvine.oeis.SkipSequence;

/**
 * A030611 <code>a(n)=least</code> k such that the base 6 representation of n begins at <code>s(k)</code>, where <code>s=A030604</code>.
 * @author Sean A. Irvine
 */
public class A030611 extends A030555 {

  /** Construct the sequence. */
  public A030611() {
    super(new SkipSequence(new A030604(), 2), 0);
  }
}

