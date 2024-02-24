package irvine.oeis.a068;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.CachedSequence;

/**
 * A068545.
 * @author Sean A. Irvine
 */
public class A068573 extends CachedSequence {

  private final HashSet<Z> mSums = new HashSet<>();

  /** Construct the sequence. */
  public A068573() {
    super(1);
  }

  private boolean isOk(final Z k) {
    for (final Z t : mSums) {
      if (t.mod(k).isZero()) {
        return false;
      }
    }
    for (final Z a : values()) {
      for (final Z b : values()) {
        if (!a.equals(b) && b.add(k).mod(a).isZero()) {
          return false;
        }
      }
    }
    return true;
  }

  @Override
  protected Z compute(final Z n) {
    if (Z.ONE.equals(n)) {
      return Z.THREE;
    }
    if (mSums.isEmpty()) {
      mSums.add(Z.SEVEN);
      return Z.FOUR;
    }
    Z k = a(n.subtract(1));
    while (true) {
      k = k.add(1);
      if (isOk(k)) {
        for (final Z a : values()) {
          mSums.add(a.add(k));
        }
        return k;
      }
    }
  }
}
