package irvine.oeis.a026;

import irvine.oeis.PositionOfNSequence;

/**
 * A026273 a(n) = least k such that s(k) = n, where s = A026272.
 * @author Sean A. Irvine
 */
public class A026273 extends PositionOfNSequence {

  /** Construct the sequence. */
  public A026273() {
    super(new A026272());
  }
}
