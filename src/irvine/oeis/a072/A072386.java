package irvine.oeis.a072;

import java.util.TreeSet;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000217;

/**
 * A072386 Primes which can be represented as the sum of a triangular number and its reverse.
 * @author Sean A. Irvine
 */
public class A072386 extends Sequence1 {

  private final Sequence mSeq = new A000217();
  private final TreeSet<Z> mA = new TreeSet<>();
  private Z mT = mSeq.next();

  @Override
  public Z next() {
    while (mA.isEmpty() || mA.first().compareTo(mT) >= 0) {
      mT = mSeq.next();
      final Z t = Functions.REVERSE_AND_ADD.z(mT);
      if (t.isProbablePrime()) {
        mA.add(t);
      }
    }
    return mA.pollFirst();
  }
}
