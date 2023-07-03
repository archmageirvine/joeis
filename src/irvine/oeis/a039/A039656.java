package irvine.oeis.a039;

import irvine.oeis.InverseSequence;

/**
 * A039656 Becomes prime after n iterations of f(x) = sigma(x)-1 (least inverse of A039655).
 * @author Sean A. Irvine
 */
public class A039656 extends InverseSequence {

  /** Construct the sequence. */
  public A039656() {
    super(0, new A039655(), 0, 2);
  }
}
