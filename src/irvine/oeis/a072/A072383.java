package irvine.oeis.a072;

import java.util.TreeSet;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000290;

/**
 * A072383 Primes which can be represented as the sum of a square and its reverse.
 * @author Sean A. Irvine
 */
public class A072383 extends Sequence1 {

  private final Sequence mSquares = new A000290();
  private final TreeSet<Z> mA = new TreeSet<>();
  private Z mS = mSquares.next();

  @Override
  public Z next() {
    while (mA.isEmpty() || mA.first().compareTo(mS) >= 0) {
      mS = mSquares.next();
      final Z t = Functions.REVERSE_AND_ADD.z(mS);
      if (t.isProbablePrime()) {
        mA.add(t);
      }
    }
    return mA.pollFirst();
  }
}
