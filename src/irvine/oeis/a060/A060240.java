package irvine.oeis.a060;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.partitions.IntegerPartition;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A060240 Triangle T(n,k) in which n-th row gives degrees of irreducible representations of symmetric group S_n.
 * @author Sean A. Irvine
 */
public class A060240 extends AbstractSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A060240(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A060240() {
    super(0);
  }

  protected final MemoryFactorial mF = MemoryFactorial.SINGLETON;
  private int mN = -1;
  private List<Z> mReps = Collections.emptyList();
  private int mM = 0;

  protected Z degree(final int n, final int[] a) {
    final int k = a.length;
    Z d = mF.factorial(n);
    for (int i = 0; i < k; ++i) {
      final int b = a[i] + k - i - 1;
      for (int j = i + 1; j < k; ++j) {
        d = d.multiply(b - a[j] - k + j + 1);
      }
    }
    for (int i = 0; i < k; ++i) {
      d = d.divide(mF.factorial(a[i] + k - i - 1));
    }
    return d;
  }

  protected List<Z> representations(final int n) {
    if (n == 0) {
      return Collections.singletonList(Z.ONE);
    }
    final ArrayList<Z> reps = new ArrayList<>();
    final IntegerPartition partition = new IntegerPartition(n);
    int[] p;
    while ((p = partition.next()) != null) {
      reps.add(degree(n, p));
    }
    return reps;
  }

  @Override
  public Z next() {
    if (++mM >= mReps.size()) {
      mReps = representations(++mN);
      Collections.sort(mReps);
      mM = 0;
    }
    return mReps.get(mM);
  }
}
