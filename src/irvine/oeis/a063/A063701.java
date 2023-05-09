package irvine.oeis.a063;

import irvine.oeis.FilterSequence;

/**
 * A063701 Composite solutions to Sigma[x+d[x]] = Sigma[x]+d[x], where Sigma[] = A000203(), d[] = A000005().
 * @author Sean A. Irvine
 */
public class A063701 extends FilterSequence {

  /** Construct the sequence. */
  public A063701() {
    super(new A063700(), k -> !k.isProbablePrime());
  }
}

