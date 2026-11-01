package irvine.oeis.a087;

import irvine.oeis.FilterPositionSequence;

/**
 * A087158 Satisfies a(n+2)=a(n+1)+A087157(n)+1.
 * @author Sean A. Irvine
 */
public class A087158 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A087158() {
    super(1, 1, new A087157(), (n, k) -> n == 1 || !k.isOne());
  }
}
