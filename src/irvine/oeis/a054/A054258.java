package irvine.oeis.a054;

import irvine.oeis.IntersectionSequence;

/**
 * A054256.
 * @author Sean A. Irvine
 */
public class A054258 extends IntersectionSequence {

  /** Construct the sequence. */
  public A054258() {
    super(new A054256(), new A054257());
  }
}
