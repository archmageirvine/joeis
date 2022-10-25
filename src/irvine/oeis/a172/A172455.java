package irvine.oeis.a172;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A172455 The case S(6,-4,-1) of the family of self-convolutive recurrences studied by Martin and Kearney.
 * @author Georg Fischer
 */
public class A172455 extends MemorySequence {

  private final int mA; // S(a,b,c)
  private final int mB;
  private final int mC;

  /** Construct the sequence. */
  public A172455() {
    this(6, -4, -1);
  }

  protected A172455(final int a, final int b, final int c) {
    mA = a;
    mB = b;
    mC = c;
    next(); // skip a(0)
    setOffset(1);
  }

  /* a(n) = (6*n - 4) * a(n-1) - Sum_{k=1..n-1} a(k) * a(n-k) if n>1. */
  @Override
  protected Z computeNext() {
    final int n = size();
    if (n <= 1) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    for (int k = 1; k < n; ++k) {
      sum = sum.add(a(k).multiply(a(n - k)));
    }
    return a(n - 1).multiply(mA * n + mB).add(sum.multiply(mC));
  }
}
