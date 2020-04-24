package irvine.oeis.a031;

import irvine.oeis.SkipSequence;

/**
 * A031335 <code>a(n)=least</code> k such that n begins at <code>s(k)</code>, where <code>s=A031324</code>.
 * @author Sean A. Irvine
 */
public class A031335 extends A031297 {

  /** Construct the sequence. */
  public A031335() {
    super(new SkipSequence(new A031324(), 2), 0);
  }
}

