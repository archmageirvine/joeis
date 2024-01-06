package irvine.oeis.a067;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;

/**
 * A067737 Integers n such that [number of integers k such that k is not of the form m + reverse(m) for any m and n occurs in the "Reverse and Add!" trajectory of k] is greater than [number of integers k such that n = k + reverse(k)].
 * @author Sean A. Irvine
 */
public class A067737 extends Sequence1 {

  private final Sequence mA = new A067284();
  private final Sequence mB = new A067032();
  private final Sequence mC = new A067030();

  @Override
  public Z next() {
    while (true) {
      final Z a = mA.next();
      final Z b = mB.next();
      final Z c = mC.next();
      if (a.compareTo(b) > 0) {
        return c;
      }
    }
  }
}
