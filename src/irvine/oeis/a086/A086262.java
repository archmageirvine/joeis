package irvine.oeis.a086;

import irvine.oeis.Combiner;

/**
 * A086262 Number of n X n conference matrices (including both symmetric and antisymmetric).
 * @author Sean A. Irvine
 */
public class A086262 extends Combiner {

  /** Construct the sequence. */
  public A086262() {
    super(1, new A086260().skip().prepend(0), new A086261(), ADD);
  }
}
