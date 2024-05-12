package irvine.oeis.a039;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A039957 Squarefree numbers congruent to 3 mod 4.
 * @author Sean A. Irvine
 */
public class A039957 extends AbstractSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A039957(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A039957() {
    super(1);
  }

  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      mN += 4;
      if (Predicates.SQUARE_FREE.is(mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}

