package irvine.oeis.a082;

import irvine.oeis.InverseSequence;

/**
 * A082318 Permutation A057502 applied thrice ("cubed").
 * @author Sean A. Irvine
 */
public class A082318 extends InverseSequence {

  /** Construct the sequence. */
  public A082318() {
    super(0, 0, new A082317(), 0);
  }
}
