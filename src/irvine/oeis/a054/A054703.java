package irvine.oeis.a054;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A054703 Number of distinct powers of 2 modulo n.
 * @author Georg Fischer
 */
public class A054703 implements Sequence {

  private int mN = 0;
  private int mBase;

  /** Construct the sequence. */
  public A054703() {
    this(2);
  }

  /**
   * Generic constructor with parameters
   * @param base
   */
  public A054703(final int base) {
    mBase = base;
    mN = 0;
  }

  @Override
  public Z next() {
    ++mN;
    Z basePow = Z.ONE;
    final Z n = Z.valueOf(mN);
    final TreeSet<Z> ts = new TreeSet<>();
    for (int k = 1; k <= mN; ++k) {
      ts.add(basePow.mod(n));
      basePow = basePow.multiply(mBase);
    }
    return Z.valueOf(ts.size());
  }
}
