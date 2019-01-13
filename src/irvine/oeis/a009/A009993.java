package irvine.oeis.a009;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A009993.
 * @author Sean A. Irvine
 */
public class A009993 implements Sequence {

  private final TreeSet<Z> mSeq = new TreeSet<>();

  {
    insert(Z.ZERO);
  }

  private void insert(final Z v) {
    mSeq.add(v);
    final long r = v.mod(10);
    for (long k = r + 1; k < 10; ++k) {
      insert(v.multiply(10).add(k));
    }
  }

  @Override
  public Z next() {
    return mSeq.isEmpty() ? null : mSeq.pollFirst();
  }
}
