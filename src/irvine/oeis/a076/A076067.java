package irvine.oeis.a076;

import irvine.oeis.Combiner;
import irvine.oeis.a002.A002808;

/**
 * A076067 Sum of members of n-th group in A076063 divided by n-th composite number.
 * @author Sean A. Irvine
 */
public class A076067 extends Combiner {

  /** Construct the sequence. */
  public A076067() {
    super(new A076066(), new A002808(), DIVIDE);
  }
}
