package irvine.oeis.a077;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a033.A033307;

/**
 * A077295 Partition the concatenation 1234567...of natural numbers into successive strings which are even, all different and &gt; 2. (0 never taken as the most significant digit.).
 * @author Sean A. Irvine
 */
public class A077295 extends Sequence1 {

  private final HashSet<Z> mSeen = new HashSet<>();
  private final Sequence mDigits = new A033307();
  private final long mMod;
  private Z mA = mDigits.next();

  protected A077295(final long mod) {
    mMod = mod;
    mSeen.add(Z.valueOf(mod));
  }

  /** Construct the sequence. */
  public A077295() {
    this(2);
  }

  @Override
  public Z next() {
    Z v = Z.ZERO;
    while (true) {
      do {
        v = v.multiply(10).add(mA);
        mA = mDigits.next();
      } while (mA.isZero());
      if (v.mod(mMod) == 0 && mSeen.add(v)) {
        return v;
      }
    }
  }
}
