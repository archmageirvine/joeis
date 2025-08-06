package irvine.oeis.a079;

import irvine.oeis.Combiner;

/**
 * A079302 a(n) = number of shortest addition chains for n that are non-Brauer chains.
 * @author Sean A. Irvine
 */
public class A079302 extends Combiner {

  /** Construct the sequence. */
  public A079302() {
    super(1, new A079300(), new A079301(), SUBTRACT);
  }
}
