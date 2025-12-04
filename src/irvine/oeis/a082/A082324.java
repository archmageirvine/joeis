package irvine.oeis.a082;

import irvine.oeis.InverseSequence;

/**
 * A082324 Permutation A057502 applied six times ("^6"), permutation A082318 squared, permutation A082316 cubed.
 * @author Sean A. Irvine
 */
public class A082324 extends InverseSequence {

  /** Construct the sequence. */
  public A082324() {
    super(0, 0, new A082323(), 0);
  }
}
