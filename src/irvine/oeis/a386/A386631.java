package irvine.oeis.a386;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A386631 Values of u in the quartets (2, u, v, w) of type 3; i.e., values of u for solutions to 2(2 - u) = v(v - w), in distinct positive integers, with v &gt; 1, sorted by nondecreasing values of u; see Comments.
 * @author Sean A. Irvine
 */
public class A386631 extends Sequence1 {

  private final long mM;
  private long mU;
  private long mV;

  protected A386631(final long m) {
    mM = m;
    mU = 1;
    mV = mM;
  }

  /** Construct the sequence. */
  public A386631() {
    this(2);
  }

  protected Z select(final long u, final long v, final long w) {
    //System.out.println("(" + mM + "," + u + "," + v + "," + w + ")");
    return Z.valueOf(u);
  }

  @Override
  public Z next() {
    while (true) {
      if (++mV > mM * (mM + mU)) {
        if (++mU == mM) {
          ++mU;
        }
        mV = mM + 1;
      }
      if (mU != mV && (mM * (mM - mU)) % mV == 0) {
        final long w = mV - (mM * (mM - mU)) / mV;
        if (w > 0 && w != mM && w != mU && w != mV) {
          return select(mU, mV, w);
        }
      }
    }
  }
}
