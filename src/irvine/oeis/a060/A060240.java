package irvine.oeis.a060;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.partitions.IntegerPartition;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A060240.
 * @author Sean A. Irvine
 */
public class A060240 implements Sequence {

  protected final MemoryFactorial mF = new MemoryFactorial();
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
