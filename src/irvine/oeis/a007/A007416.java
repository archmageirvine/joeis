package irvine.oeis.a007;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.a005.A005179;

/**
 * A007416.
 * @author Sean A. Irvine
 */
public class A007416 extends A005179 {

  private final TreeSet<Z> mSeq = new TreeSet<>();
  private Z mLast = Z.ZERO;

  @Override
  public Z next() {
    mSeq.add(super.next());
    mSeq.add(super.next());
    final Z a = mSeq.pollFirst();
    if (a.compareTo(mLast) <= 0) {
      // Detect if heuristic sorting ever fails
      throw new UnsupportedOperationException("Sorting problem");
    }
    mLast = a;
    return a;
  }
}
