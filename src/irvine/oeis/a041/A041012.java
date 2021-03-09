package irvine.oeis.a041;
// manually 2021-03-04

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A041012 Concatenate the next a(n) integers to get the n+1 term.
 * @author Georg Fischer
 */
public class A041012 implements Sequence {

  private int mN; // current number to be concerned
  private int mLimit;
  
  /** Construct the sequence. */
  public A041012() {
    mN = 0;
    mLimit = 1;
  }

  @Override
  public Z next() {
    if (mLimit < 1024) {
      final StringBuilder buf = new StringBuilder(128);
      for (int ix = 0; ix < mLimit; ++ix) {
        ++mN;
        buf.append(mN);
      }
      final Z term = new Z(buf.toString());
      // System.out.println("mTerm=" + mTerm + ", mN=" + mN + ", mLimit=" + mLimit + ", buf=" + buf);
      mLimit = term.intValue();
      mN = mLimit;
      return term;
    } else {
      System.err.println("# A041012: implementation limit reached");
      return null;
    }
  }
}
