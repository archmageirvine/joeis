package irvine.oeis.a390;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.CachedSequence;

/**
 * A390396 allocated for Marc Morgenegg.
 * @author Sean A. Irvine
 */
public class A390396 extends CachedSequence {

  private final TreeSet<Z> mForbidden = new TreeSet<>();
  private Z mN = Z.ZERO;

  /** Construct the sequence. */
  public A390396() {
    super(1);
  }

  @Override
  protected Z compute(final Z n) {
    while (true) {
      mN = mN.add(1);
      if (!mForbidden.remove(mN)) {
        for (final Z v : values()) {
          mForbidden.add(mN.add(v));
          mForbidden.add(mN.multiply(v));
          mForbidden.add(mN.pow(v));
          mForbidden.add(v.pow(mN));
        }
        return mN;
      }
    }
  }
}
