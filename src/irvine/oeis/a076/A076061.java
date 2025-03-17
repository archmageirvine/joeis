package irvine.oeis.a076;

import irvine.oeis.Combiner;
import irvine.oeis.a000.A000040;

/**
 * A076061 Sum of members of n-th group in A076062 divided by n-th prime.
 * @author Sean A. Irvine
 */
public class A076061 extends Combiner {

  /** Construct the sequence. */
  public A076061() {
    super(new A076060(), new A000040(), DIVIDE);
  }
}
