package irvine.oeis.a076;

import irvine.oeis.FilterSequence;

/**
 * A076152 Let c = Sum_{k&gt;=0} 1/2^(k!). Sequence gives values of terms not congruent to 5 in the continued fraction for c.
 * @author Sean A. Irvine
 */
public class A076152 extends FilterSequence {

  /** Construct the sequence. */
  public A076152() {
    super(1, new A076157(), k -> k.mod(5) != 0);
  }
}
