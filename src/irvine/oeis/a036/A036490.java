package irvine.oeis.a036;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A036490 Numbers whose prime factors are in {5, 7, 11}.
 * @author Sean A. Irvine
 */
public class A036490 extends Sequence1 {

  private final TreeSet<Z> mPriority = new TreeSet<>();

  /** Construct the sequence. */
  public A036490() {
    mPriority.add(Z.FIVE);
    mPriority.add(Z.SEVEN);
    mPriority.add(Z.valueOf(11));
  }

  @Override
  public Z next() {
    final Z r = mPriority.pollFirst();
    mPriority.add(r.multiply(5));
    mPriority.add(r.multiply(7));
    mPriority.add(r.multiply(11));
    return r;
  }
}
