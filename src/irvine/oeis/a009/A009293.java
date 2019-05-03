package irvine.oeis.a009;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A009293 If a, b in sequence, so is <code>a*b+1</code>.
 * @author Sean A. Irvine
 */
public class A009293 extends MemorySequence {

  private final TreeSet<Z> mFutureMembers = new TreeSet<>();

  protected long add() {
    return 1;
  }

  @Override
  protected Z computeNext() {
    if (isEmpty()) {
      mFutureMembers.add(Z.FOUR.add(add()));
      return Z.TWO;
    }
    final Z res = mFutureMembers.pollFirst();
    mFutureMembers.add(res.square().add(add()));
    for (final Z v : this) {
      mFutureMembers.add(res.multiply(v).add(add()));
    }
    return res;
  }

}
