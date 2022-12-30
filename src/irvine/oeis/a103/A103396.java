package irvine.oeis.a103;
// manually 2022-12-25

import irvine.oeis.IntersectionSequence;
import irvine.oeis.a001.A001358;

/**
 * A103396 Semiprimes in A103376.
 * @author Georg Fischer
 */
public class A103396 extends IntersectionSequence {

  /** Construct the sequence. */
  public A103396() {
    super(new A103376(), new A001358());
  }
}
