package irvine.oeis.a080;

import irvine.oeis.InverseSequence;

/**
 * A080998 a(n) is n's rank among the positive integers in terms of centrality: the fraction of n represented by the average gcd of n and the positive integers, or A018804(n)/n^2 (cf. A080997).
 * @author Sean A. Irvine
 */
public class A080998 extends InverseSequence {

  /** Construct the sequence. */
  public A080998() {
    super(1, new A080997());
  }
}

