package irvine.oeis.a383;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A383927 Binary echo numbers: positive integers k such that the gpf(k-1) is a suffix of k when gpf(k-1) and k are written in binary.
 * @author Sean A. Irvine
 */
public class A383927 extends Sequence1 {

  private final int mBase;
  private long mN = 1;

  protected A383927(final int base) {
    mBase = base;
  }

  /** Construct the sequence. */
  public A383927() {
    this(2);
  }

  @Override
  public Z next() {
    while (true) {
      if (Predicates.ECHO.is(mBase, ++mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
