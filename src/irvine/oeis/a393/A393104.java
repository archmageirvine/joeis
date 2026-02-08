package irvine.oeis.a393;

import irvine.math.z.Z;
import irvine.oeis.a386.A386296;

/**
 * A393104 allocated for Janaka Rodrigo.
 * @author Sean A. Irvine
 */
public class A393104 extends A386296 {

  private int mMinSurface = 0;
  private int mN = 2;

  /** Construct the sequence. */
  public A393104() {
    super(3);
  }

  @Override
  protected boolean accept(final int[] set) {
    final int surface = getSurface(set);
    synchronized (A393104.this) {
      return surface < mMinSurface;
    }
  }

  @Override
  protected void process(final int[] set) {
    final int surface = getSurface(set);
    synchronized (A393104.this) {
      if (surface < mMinSurface) {
        mMinSurface = surface;
      }
    }
  }

  @Override
  public Z next() {
    mMinSurface = Integer.MAX_VALUE;
    t(++mN, 5);
    return Z.valueOf(mMinSurface == Integer.MAX_VALUE ? 0 : mMinSurface);
  }
}

