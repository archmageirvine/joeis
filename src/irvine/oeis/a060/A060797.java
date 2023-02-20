package irvine.oeis.a060;

import irvine.math.z.Z;
import irvine.oeis.a002.A002110;

/**
 * A060797 Integer part of square root of n-th primorial, A002110(n).
 * @author Sean A. Irvine
 * @author Georg Fischer
 */
public class A060797 extends A002110 {

  private int mRoot;

  /** Construct the sequence. */
  public A060797() {
    this(0, 2);
  }

  /**
   * Generic constructor with parameters.
   * @param offset first index
   * @param root take this root of A002110(n)
   */
  public A060797(final int offset, final int root) {
    mRoot = root;
    if (offset == 1) {
      super.next();
    }
  }

  @Override
  public Z next() {
    return super.next().root(mRoot);
  }
}
