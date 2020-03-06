package irvine.oeis.a029;

import irvine.oeis.EulerTransformSequence;
import irvine.oeis.PeriodicSequence;

/**
 * A029864 <code>G:=1/product((1-x^(3k-2))*(1-x^(3k-1))^2*(1-x^(3k))^3,k=1..infinity)</code>.
 * @author Sean A. Irvine
 */
public class A029864 extends EulerTransformSequence {

  /** Construct the sequence. */
  public A029864() {
    super(new PeriodicSequence(1, 2, 3), 0);
  }
}
