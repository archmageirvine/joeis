package irvine.oeis.a082;

import irvine.oeis.InverseSequence;

/**
 * A082320 Permutation A057502 applied four times ("^4"), permutation A082316 squared.
 * @author Sean A. Irvine
 */
public class A082320 extends InverseSequence {

  /** Construct the sequence. */
  public A082320() {
    super(0, 0, new A082319(), 0);
  }
}
