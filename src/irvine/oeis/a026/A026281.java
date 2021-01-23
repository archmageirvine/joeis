package irvine.oeis.a026;

import irvine.oeis.PositionOfNSequence;

/**
 * A026281 a(n) = least k such that s(k) = n, where s = A026280.
 * @author Sean A. Irvine
 */
public class A026281 extends PositionOfNSequence {

  /** Construct the sequence. */
  public A026281() {
    super(new A026280());
  }
}
