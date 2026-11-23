package irvine.oeis.a057;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.DirectPredicate;

/**
 * A057716 The nonpowers of 2.
 * @author Georg Fischer
 */
public class A057716 extends AbstractSequence implements DirectPredicate {

  private long mN = -1;

  /** Construct the sequence. */
  public A057716() {
    super(0);
  }

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (Long.bitCount(mN) != 1) {
        return Z.valueOf(mN);
      }
    }
  }

  @Override
  public boolean is(final Z n) {
    return n.bitCount() != 1;
  }

  @Override
  public boolean is(final long n) {
    return Long.bitCount(n) != 1;
  }

}
