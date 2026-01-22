package irvine.oeis.a083;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000142;

/**
 * A083397 Largest prime factor of n! + k where k is the least positive integer such that n! + k is a square.
 * @author Sean A. Irvine
 */
public class A083397 extends Sequence1 {

  private final Sequence mF = new A000142().skip();

  @Override
  public Z next() {
    final Z f = mF.next();
    if (Z.ONE.equals(f)) {
      return Z.ZERO;
    }
    return Functions.GPF.z(f.sqrt().add(1));
  }
}

