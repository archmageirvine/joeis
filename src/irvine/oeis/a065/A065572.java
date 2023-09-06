package irvine.oeis.a065;

import irvine.oeis.FilterSequence;

/**
 * A065572 Composite numbers k such that phi(k) = phi(k-1) + phi(k-2).
 * @author Sean A. Irvine
 */
public class A065572 extends FilterSequence {

  /** Construct the sequence. */
  public A065572() {
    super(new A065557(), k -> !k.isProbablePrime());
  }
}
