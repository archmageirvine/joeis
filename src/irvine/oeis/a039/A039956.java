package irvine.oeis.a039;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A039956 Even squarefree numbers.
 * @author Sean A. Irvine
 */
public class A039956 extends AbstractSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A039956(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A039956() {
    super(1);
  }

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      mN += 2;
      if (Predicates.SQUARE_FREE.is(mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}

