package irvine.oeis.a039;

import irvine.oeis.PositionOfNSequence;

/**
 * A039656 Becomes prime after n iterations of f(x) = sigma(x)-1 (least inverse of A039655).
 * @author Sean A. Irvine
 */
public class A039656 extends PositionOfNSequence {

  /** Construct the sequence. */
  public A039656() {
    super(new A039655(), 0, 2);
  }
}
