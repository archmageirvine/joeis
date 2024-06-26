package irvine.oeis.a024;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A024670 Numbers that are sums of 2 distinct positive cubes.
 * @author Sean A. Irvine
 */
public class A024670 extends AbstractSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A024670(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A024670() {
    super(1);
  }

  private long mN = 8;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      for (long k = 1; k * k * k * 2 < mN; ++k) {
        if (Predicates.CUBE.is(mN - k * k * k)) {
          return Z.valueOf(mN);
        }
      }
    }
  }
}
