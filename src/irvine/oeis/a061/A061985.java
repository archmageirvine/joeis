package irvine.oeis.a061;

import irvine.oeis.DistinctSequence;

/**
 * A061985 Values which can occur in sequence b(k) = 1 + b(floor(k/2)) + b(floor(k/3)) with b(0) = 0, i.e., in A061984.
 * @author Sean A. Irvine
 */
public class A061985 extends DistinctSequence {

  /** Construct the sequence. */
  public A061985() {
    super(new A061984());
  }
}
