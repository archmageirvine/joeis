package irvine.oeis.a075;

import irvine.oeis.FilterSequence;

/**
 * A075764 Schroeder pseudoprimes: Composites k that divide the k-th Schroeder number A001003(k-1).
 * @author Sean A. Irvine
 */
public class A075764 extends FilterSequence {

  /** Construct the sequence. */
  public A075764() {
    super(new A075763(), NONPRIME);
  }
}
