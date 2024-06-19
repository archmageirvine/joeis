package irvine.oeis.a070;

import java.util.ArrayList;
import java.util.List;

import irvine.math.z.Z;
import irvine.oeis.FiniteSequence;
import irvine.oeis.Sequence0;
import irvine.oeis.closure.DistinctMultiplicativeClosureSequence;

/**
 * A070861 Triangle of all possible distinct numbers obtained as a product of distinct numbers from 1..n.
 * @author Sean A. Irvine
 */
public class A070861 extends Sequence0 {

  private final List<Z> mA = new ArrayList<>();
  private DistinctMultiplicativeClosureSequence mClosure = new DistinctMultiplicativeClosureSequence(new FiniteSequence());
  private long mN = 0;

  @Override
  public Z next() {
    final Z r = mClosure.next();
    if (r == null) {
      mA.add(Z.valueOf(++mN));
      mClosure = new DistinctMultiplicativeClosureSequence(new FiniteSequence(mA));
      return mClosure.next();
    }
    return r;
  }
}
