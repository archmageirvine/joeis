package irvine.oeis.a031;

import irvine.oeis.SkipSequence;

/**
 * A031335 a(n)=least k such that n begins at s(k), where s=A031324.
 * @author Sean A. Irvine
 */
public class A031335 extends A031297 {

  /** Construct the sequence. */
  public A031335() {
    super(new SkipSequence(new A031324(), 2), 0);
  }
}

