package irvine.oeis.a057;

import java.util.TreeSet;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A057874 Sets of three composites in bidirectional 'sum of prime factors' progression/retrogression.
 * @author Sean A. Irvine
 */
public class A057874 implements Sequence {

  private final TreeSet<Z> mA = new TreeSet<>();
  private long mN = 94;

  @Override
  public Z next() {
    while (mA.isEmpty()) {
      final Z s = Jaguar.factor(++mN).sopfr();
      final Z b = s.add(mN);
      if (Jaguar.factor(b).sopfr().equals(s)) {
        final Z c = s.add(b);
        if (Jaguar.factor(c).sopfr().equals(s)) {
          mA.add(Z.valueOf(mN));
          mA.add(b);
          mA.add(c);
        }
      }
    }
    return mA.pollFirst();
  }
}

