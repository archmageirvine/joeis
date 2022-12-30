package irvine.oeis.a103;
// manually 2022-12-25

import irvine.oeis.IntersectionSequence;
import irvine.oeis.a001.A001358;

/**
 * A103397 Semiprimes in A103377.
 * @author Georg Fischer
 */
public class A103397 extends IntersectionSequence {

  /** Construct the sequence. */
  public A103397() {
    super(new A103377(), new A001358());
  }
}
