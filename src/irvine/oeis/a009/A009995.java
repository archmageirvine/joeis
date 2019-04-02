package irvine.oeis.a009;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A009995 Numbers with digits in strictly decreasing order. From the Macaulay expansion of n.
 * @author Sean A. Irvine
 */
public class A009995 implements Sequence {

  private final TreeSet<Z> mSeq = new TreeSet<>();

  {
    for (long k = 0; k < 10; ++k) {
      insert(Z.valueOf(k));
    }
  }

  private void insert(final Z v) {
    mSeq.add(v);
    final long r = v.mod(10);
    for (int k = 0; k < r; ++k) {
      insert(v.multiply(10).add(k));
    }
  }

  @Override
  public Z next() {
    return mSeq.isEmpty() ? null : mSeq.pollFirst();
  }
}
