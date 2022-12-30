package irvine.oeis.a103;
// manually 2022-12-25

import irvine.oeis.IntersectionSequence;
import irvine.oeis.a001.A001358;

/**
 * A103395 Semiprimes in A103375.
 * @author Georg Fischer
 */
public class A103395 extends IntersectionSequence {

  /** Construct the sequence. */
  public A103395() {
    super(new A103375(), new A001358());
  }
}
