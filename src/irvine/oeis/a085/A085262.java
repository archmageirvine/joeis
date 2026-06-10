package irvine.oeis.a085;

import irvine.oeis.FilterPositionSequence;

/**
 * A085262 Indices of nonzero terms of A085246, where a(n+2)=a(n+1)+A085246(n)+1 and a(2^(n-1)+1)=2^n.
 * @author Sean A. Irvine
 */
public class A085262 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A085262() {
    super(1, new A085246(), NONZERO);
  }
}
