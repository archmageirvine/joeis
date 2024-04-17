package irvine.oeis.a057;

import java.util.TreeSet;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A057874 Sets of three composites in bidirectional 'sum of prime factors' progression/retrogression.
 * @author Sean A. Irvine
 */
public class A057874 extends Sequence0 {

  private final TreeSet<Z> mA = new TreeSet<>();
  private long mN = 94;

  @Override
  public Z next() {
    while (mA.isEmpty()) {
      final Z s = Functions.SOPFR.z(++mN);
      final Z b = s.add(mN);
      if (Functions.SOPFR.z(b).equals(s)) {
        final Z c = s.add(b);
        if (Functions.SOPFR.z(c).equals(s)) {
          mA.add(Z.valueOf(mN));
          mA.add(b);
          mA.add(c);
        }
      }
    }
    return mA.pollFirst();
  }
}

