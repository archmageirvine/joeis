package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.a000.A000119;
import irvine.util.array.DynamicLongArray;

/**
 * A013583 Smallest positive number that can be written as sum of distinct Fibonacci numbers in n ways.
 * @author Sean A. Irvine
 */
public class A013583 extends A000119 {

  /** Construct the sequence. */
  public A013583() {
    super(1);
  }

  private long mM = -1;
  private int mN = 0;
  private final DynamicLongArray mFirst = new DynamicLongArray();

  @Override
  public Z next() {
    ++mN;
    while (mFirst.get(mN) == 0) {
      ++mM;
      final int v = super.next().intValueExact();
      if (mFirst.get(v) == 0) {
        mFirst.set(v, mM);
      }
    }
    return Z.valueOf(mFirst.get(mN));
  }
}
