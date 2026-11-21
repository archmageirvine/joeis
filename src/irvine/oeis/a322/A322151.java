package irvine.oeis.a322;

import irvine.math.z.Z;

/**
 * A322151 Number of labeled connected graphs with loops with n edges (the vertices are {1,2,...,k} for some k).
 * @author Gregory Morse
 */
public class A322151 extends A322147 {
  private int mN = -1;

  protected A322151(final boolean loops, final boolean parallel) {
    super(loops, parallel);
  }

  /** Construct the sequence. */
  public A322151() {
    this(true, false);
  }

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int k = 1; k <= mN + 1; ++k) {
      sum = sum.add(connected(k, mN));
    }
    return sum;
  }
}
