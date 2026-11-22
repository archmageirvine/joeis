package irvine.oeis.a212;

import irvine.math.z.Z;

/**
 * A212085 Square array A(n,k), n&gt;=1, k&gt;=1, read by antidiagonals: A(n,k) is the number of n-colorings of the complete bipartite graph K_(k,k).
 * @author Gregory Morse
 */
public class A212085 extends A212084 {
  private int mN = 0;
  private int mK = 0;

  protected A212085(final int parts) {
    super(parts);
    setOffset(1);
  }

  /** Construct the sequence. */
  public A212085() {
    this(2);
  }

  protected Z t(final int colors, final int size) {
    return colorings(counts(size), colors);
  }

  @Override
  public Z next() {
    if (++mK > mN) {
      ++mN;
      mK = 1;
    }
    return t(mK, mN + 1 - mK);
  }
}
