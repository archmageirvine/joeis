package irvine.oeis.a103;
// manually 2022-12-25

import irvine.oeis.IntersectionSequence;
import irvine.oeis.a001.A001358;

/**
 * A103393 Semiprimes in A103373.
 * @author Georg Fischer
 */
public class A103393 extends IntersectionSequence {

  /** Construct the sequence. */
  public A103393() {
    super(new A103373(), new A001358());
  }
}
