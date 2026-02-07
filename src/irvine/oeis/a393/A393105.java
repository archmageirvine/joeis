package irvine.oeis.a393;

import irvine.math.z.Z;
import irvine.oeis.a386.A386296;

/**
 * A386297.
 * @author Sean A. Irvine
 */
public class A393105 extends A386296 {

  private int mMaxSurface = 0;
  private int mN = 2;

  /** Construct the sequence. */
  public A393105() {
    super(3);
  }

  @Override
  protected boolean accept(final int[] set) {
    final int surface = getSurface(set);
    synchronized (A393105.this) {
      return surface > mMaxSurface;
    }
  }

  @Override
  protected void process(final int[] set) {
    final int surface = getSurface(set);
    synchronized (A393105.this) {
      if (surface > mMaxSurface) {
        mMaxSurface = surface;
      }
    }
  }

  @Override
  public Z next() {
    mMaxSurface = 0;
    t(++mN, 5);
    return Z.valueOf(mMaxSurface);
  }
}

