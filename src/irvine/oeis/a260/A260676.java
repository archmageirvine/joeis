package irvine.oeis.a260;

import irvine.oeis.transform.EtaProductSequence;

/**
 * A260676 Expansion of phi(x) * psi(x^30) in powers of x where phi(), chi() are Ramanujan theta functions.
 * @author Georg Fischer
 */

public class A260676 extends EtaProductSequence {

  /** Construct the sequence. */
  public A260676() {
    super(0, "[60,2;2,5;30,-1;4,-2;1,-2]", "-15/4");
  }
}
