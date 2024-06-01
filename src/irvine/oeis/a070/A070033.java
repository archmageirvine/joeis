package irvine.oeis.a070;

import irvine.oeis.InverseSequence;

/**
 * A070033 Least number m such that integer part of sigma(m)/phi(m) equals n.
 * @author Sean A. Irvine
 */
public class A070033 extends InverseSequence {

  /** Construct the sequence. */
  public A070033() {
    super(1, new A070032());
  }
}
