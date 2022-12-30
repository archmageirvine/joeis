package irvine.oeis.a103;
// manually 2022-12-25

import irvine.oeis.IntersectionSequence;
import irvine.oeis.a001.A001358;

/**
 * A103398 Semiprimes in A103378.
 * @author Georg Fischer
 */
public class A103398 extends IntersectionSequence {

  /** Construct the sequence. */
  public A103398() {
    super(new A103378(), new A001358());
  }
}
