package irvine.oeis.a393;

import java.util.TreeSet;

import irvine.math.z.InverseEuler;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000396;

/**
 * A393942 allocated for Jaroslav Krizek.
 * @author Sean A. Irvine
 */
public class A393942 extends Sequence1 {

  private final TreeSet<Z> mA = new TreeSet<>();
  private final Sequence mPerfect = new A000396();
  private Z mP = mPerfect.next();

  @Override
  public Z next() {
    while (mA.isEmpty()) {
      mA.addAll(InverseEuler.inversePhi(mP));
      mP = mPerfect.next();
    }
    return mA.pollFirst();
  }
}
