package irvine.oeis.a074;

import java.util.TreeSet;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a073.A073491;

/**
 * A074044 Largest divisor of n having no prime gaps.
 * @author Sean A. Irvine
 */
public class A074044 extends Sequence1 {

  private long mN = 0;
  private final TreeSet<Z> mNoGaps = new TreeSet<>();
  private final Sequence mSeq = new A073491();
  {
    mNoGaps.add(mSeq.next()); // avoid need for isEmpty check later
  }

  @Override
  public Z next() {
    final Z[] d = Jaguar.factor(++mN).divisorsSorted();
    while (d[d.length - 1].compareTo(mNoGaps.last()) > 0) {
      mNoGaps.add(mSeq.next());
    }
    for (int k = d.length - 1; k >= 0; --k) {
      final Z t = d[k];
      if (mNoGaps.contains(t)) {
        return t;
      }
    }
    throw new RuntimeException();
  }
}
