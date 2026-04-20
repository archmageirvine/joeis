package irvine.oeis.a395;

import java.util.HashSet;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A395127 allocated for David Dewan.
 * @author Sean A. Irvine
 */
public class A395127 extends Sequence1 {

  private final HashSet<Z> mSeen = new HashSet<>();
  private long mN = 0;

  @Override
  public Z next() {
    Z t = Z.valueOf(++mN);
    mSeen.add(t);
    while (!t.isOne()) {
      t = Functions.COLLATZ.z(t);
      mSeen.add(t);
    }
    return Z.valueOf(mSeen.size());
  }
}
