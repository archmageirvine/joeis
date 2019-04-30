package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

import java.util.HashSet;

/**
 * A003151 Beatty sequence for <code>1+sqrt(2); a(n) = floor(n*(1+sqrt(2)))</code>.
 * @author Sean A. Irvine
 */
public class A003151 extends MemorySequence {

  private final HashSet<Z> mSeq = new HashSet<>();
  private int mN = -1;
  {
    add(Z.ZERO);
  }

  @Override
  protected Z computeNext() {
    ++mN;
    final Z r;
    if (mSeq.isEmpty()) {
      r = Z.TWO;
    } else if (mSeq.contains(Z.valueOf(mN))) {
      r = get(mN).add(3);
    } else {
      r = get(mN).add(2);
    }
    mSeq.add(r);
    return r;
  }

}
