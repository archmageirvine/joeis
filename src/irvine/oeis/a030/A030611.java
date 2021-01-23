package irvine.oeis.a030;

import irvine.oeis.SkipSequence;

/**
 * A030611 a(n)=least k such that the base 6 representation of n begins at s(k), where s=A030604.
 * @author Sean A. Irvine
 */
public class A030611 extends A030555 {

  /** Construct the sequence. */
  public A030611() {
    super(new SkipSequence(new A030604(), 2), 0);
  }
}

