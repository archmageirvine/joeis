package irvine.oeis.a073;

import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a006.A006495;

/**
 * A073019 Numbers n such that the absolute value of the real part of (1+2*I)^n is prime.
 * @author Sean A. Irvine
 */
public class A073019 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A073019() {
    super(1, 0, new A006495(), k -> k.abs().isProbablePrime());
  }
}
