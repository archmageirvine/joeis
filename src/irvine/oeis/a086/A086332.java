package irvine.oeis.a086;
// manually recval at 2023-09-10 20:29

import irvine.oeis.RecordSequence;
import irvine.oeis.a022.A022404;

/**
 * A086332 Least highly composite number having n distinct prime factors.
 * @author Georg Fischer
 */
public class A086332 extends RecordSequence {

  /** Construct the sequence. */
  public A086332() {
    super(1, new A022404());
    super.next();
  }
}
