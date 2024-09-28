package irvine.oeis.a072;

import java.util.TreeSet;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000578;

/**
 * A056964.
 * @author Sean A. Irvine
 */
public class A072384 extends Sequence1 {

  private final Sequence mCubes = new A000578();
  private final TreeSet<Z> mA = new TreeSet<>();
  private Z mC = mCubes.next();

  @Override
  public Z next() {
    while (mA.isEmpty() || mA.first().compareTo(mC) >= 0) {
      mC = mCubes.next();
      final Z t = Functions.REVERSE_AND_ADD.z(mC);
      if (t.isProbablePrime()) {
        mA.add(t);
      }
    }
    return mA.pollFirst();
  }
}
