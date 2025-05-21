package irvine.oeis.a383;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A383927 allocated for Michael S. Branicky.
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
