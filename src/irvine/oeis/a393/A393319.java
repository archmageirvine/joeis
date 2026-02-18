package irvine.oeis.a393;

import irvine.math.z.Z;
import irvine.oeis.a386.A386296;

/**
 * A393319 allocated for Janaka Rodrigo.
 * @author Sean A. Irvine
 */
public class A393319 extends A386296 {

  private int mMaxSurface = 0;

  /** Construct the sequence. */
  public A393319() {
    super(3);
  }

  @Override
  protected boolean accept(final int[] set) {
    final int surface = getSurface(set);
    synchronized (A393319.this) {
      return surface > mMaxSurface;
    }
  }

  @Override
  protected void process(final int[] set) {
    final int surface = getSurface(set);
    synchronized (A393319.this) {
      if (surface > mMaxSurface) {
        mMaxSurface = surface;
      }
    }
  }

  @Override
  public Z next() {
    mMaxSurface = 0;
    super.next();
    return Z.valueOf(mMaxSurface);
  }
}

