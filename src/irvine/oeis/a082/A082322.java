package irvine.oeis.a082;

import irvine.oeis.InverseSequence;

/**
 * A082322 Permutation A057502 applied five times ("^5").
 * @author Sean A. Irvine
 */
public class A082322 extends InverseSequence {

  /** Construct the sequence. */
  public A082322() {
    super(0, 0, new A082321(), 0);
  }
}
