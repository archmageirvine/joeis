package irvine.oeis.a066;

import irvine.oeis.UnionSequence;
import irvine.oeis.a005.A005843;
import irvine.oeis.a058.A058529;

/**
 * A066507 Numbers k such that there is a solution to x^2 == 2^k (mod k).
 * @author Sean A. Irvine
 */
public class A066507 extends UnionSequence {

  /** Construct the sequence. */
  public A066507() {
    super(new A058529(), new A005843().skip());
  }
}

