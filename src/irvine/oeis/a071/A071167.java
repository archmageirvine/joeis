package irvine.oeis.a071;

import irvine.oeis.Combiner;
import irvine.oeis.a023.A023194;
import irvine.oeis.a062.A062700;

/**
 * A071167 a(n) = A023194 - A062700(n). Negative values of A071166(m) = m-A006530(A000203(m)) differences. In these cases m is square number from A023194.
 * @author Sean A. Irvine
 */
public class A071167 extends Combiner {

  /** Construct the sequence. */
  public A071167() {
    super(new A023194(), new A062700(), SUBTRACT);
  }
}
