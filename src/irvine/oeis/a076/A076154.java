package irvine.oeis.a076;

import irvine.oeis.FilterSequence;

/**
 * A076154 Let c = Sum_{k&gt;=0} 1/2^(k!), sequence gives values of terms congruent to 5 of the continued fraction for c.
 * @author Sean A. Irvine
 */
public class A076154 extends FilterSequence {

  /** Construct the sequence. */
  public A076154() {
    super(1, new A076157(), k -> k.mod(5) == 0);
  }
}
