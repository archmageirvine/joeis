package irvine.oeis.a074;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000178;

/**
 * A074198 Largest k such that 1!*2!*3!*...*k! divides n!.
 * @author Sean A. Irvine
 */
public class A074198 extends Sequence1 {

  private final Sequence mSuperfactorial = new A000178();
  private long mN = 0;
  private long mM = 0;
  private Z mS = mSuperfactorial.next();

  @Override
  public Z next() {
    final Z f = Functions.FACTORIAL.z(++mN);
    while (f.mod(mS).isZero()) {
      ++mM;
      mS = mSuperfactorial.next();
    }
    return Z.valueOf(mM - 1);
  }
}
