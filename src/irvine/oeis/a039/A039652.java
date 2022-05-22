package irvine.oeis.a039;

import irvine.oeis.InverseSequence;

/**
 * A039652 Becomes prime after n iterations of f(x) = phi(x)+1 (least inverse of A039651).
 * @author Sean A. Irvine
 */
public class A039652 extends InverseSequence {

  /** Construct the sequence. */
  public A039652() {
    super(new A039651(), 0);
  }
}
