package irvine.oeis.a000;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.function.Functions;
import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A000670 Fubini numbers: number of preferential arrangements of n labeled elements; or number of weak orders on n labeled elements; or number of ordered partitions of [n].
 * @author Sean A. Irvine
 */
public class A000670 extends AbstractSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A000670(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A000670() {
    super(0);
  }

  protected int mN = -1;
  protected final MemoryFactorial mF = MemoryFactorial.SINGLETON;

  @Override
  public Z next() {
    ++mN;
    Z s = Z.ZERO;
    for (int k = 0; k <= mN; ++k) {
      s = s.add(Functions.FACTORIAL.z(k).multiply(Stirling.secondKind(mN, k)));
    }
    return s;
  }
}
