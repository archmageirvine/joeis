package irvine.oeis.a048;

import java.util.Arrays;
import java.util.TreeSet;

import irvine.math.Comparators;
import irvine.math.factorial.MemoryFactorial;
import irvine.math.function.Functions;
import irvine.math.partition.IntegerPartition;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A048996 Irregular triangle read by rows. Preferred multisets: numbers refining A007318 using format described in A036038.
 * @author Sean A. Irvine
 */
public class A048996 extends AbstractSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A048996(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A048996() {
    super(0);
  }

  private final MemoryFactorial mF = MemoryFactorial.SINGLETON;
  private final TreeSet<int[]> mA = new TreeSet<>(Comparators.ABRAHAM_STEGUN);
  protected int mN = -1;
  private int[] mC;

  @Override
  public Z next() {
    if (mA.isEmpty()) {
      if (++mN == 0) {
        return Z.ONE;
      }
      final IntegerPartition part = new IntegerPartition(mN);
      int[] p;
      while ((p = part.next()) != null) {
        mA.add(Arrays.copyOf(p, p.length));
      }
      mC = new int[mN + 1];
    }
    IntegerPartition.toCountForm(mA.pollFirst(), mC);
    Z prod = Z.ONE;
    Z sum = Z.ZERO;
    for (final int c : mC) {
      sum = sum.add(c);
      prod = prod.multiply(Functions.FACTORIAL.z(c));
    }
    return Functions.FACTORIAL.z(sum).divide(prod);
  }
}

