package irvine.oeis.a274;

import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.oeis.KimberlingTreeSequence;

/**
 * A274142 Number of integers in n-th generation of tree T(1/2) defined in Comments.
 * @author Georg Fischer
 */
public class A274142 extends KimberlingTreeSequence<Q> {

  /** Construct the sequence. */
  public A274142() {
    this(0, new Q(1, 2));
  }

  /**
   * Generic constructor with parameters.
   * @param offset first index
   * @param r value for x
   */
  protected A274142(final int offset, final Q r) {
    super(offset, Rationals.SINGLETON, r, true);
  }
}
