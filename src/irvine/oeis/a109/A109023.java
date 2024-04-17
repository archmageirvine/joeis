package irvine.oeis.a109;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A109023 3-almost primes (A014612) whose digit reversal is different and also has 3 prime factors (with multiplicity). "Emirp Tsomla-3.".
 * @author Georg Fischer
 */
public class A109023 extends Sequence1 {

  private long mN;
  private final int mCount;

  /** Construct the sequence. */
  public A109023() {
    this(3);
  }

  /**
   * Generic constructor with parameters.
   * @param count number of prime factors
   */
  public A109023(final int count) {
    mCount = count;
    mN = 0;
  }

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (Functions.BIG_OMEGA.l(mN) == mCount) {
        final Z nz = Z.valueOf(mN);
        final Z revn = Functions.REVERSE.z(nz);
        if (!revn.equals(nz) && Functions.BIG_OMEGA.l(revn) == mCount) {
          return nz;
        }
      }
    }
  }
}
