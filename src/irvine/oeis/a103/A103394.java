package irvine.oeis.a103;
// manually 2022-12-25

import irvine.oeis.IntersectionSequence;
import irvine.oeis.a001.A001358;

/**
 * A103394 Semiprimes in A103374.
 * @author Georg Fischer
 */
public class A103394 extends IntersectionSequence {

  /** Construct the sequence. */
  public A103394() {
    super(new A103374(), new A001358());
  }
}
