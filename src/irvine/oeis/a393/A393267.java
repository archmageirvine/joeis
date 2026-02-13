package irvine.oeis.a393;

import irvine.math.z.Z;
import irvine.oeis.a386.A386296;

/**
 * A393267 allocated for Janaka Rodrigo.
 * @author Sean A. Irvine
 */
public class A393267 extends A386296 {

  private int mMinSurface = 0;
  private int mN = 0;
  private int mM = 0;

  /** Construct the sequence. */
  public A393267() {
    super(3);
  }

  @Override
  protected boolean accept(final int[] set) {
    final int surface = getSurface(set);
    synchronized (A393267.this) {
      return surface < mMinSurface;
    }
  }

  @Override
  protected void process(final int[] set) {
    final int surface = getSurface(set);
    synchronized (A393267.this) {
      if (surface < mMinSurface) {
        mMinSurface = surface;
      }
    }
  }

  @Override
  public Z next() {
    mMinSurface = Integer.MAX_VALUE;
    if (++mM >= mN) {
      ++mN;
      mM = 0;
    }
    t(mM + 3, mN - mM);
    return Z.valueOf(mMinSurface == Integer.MAX_VALUE ? 0 : mMinSurface);
  }
}

