package irvine.oeis.a386;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a009.A009000;
import irvine.oeis.a046.A046083;
import irvine.oeis.a046.A046084;

/**
 * A386306 a(n) is the total number of prime factors (with multiplicity) of the three sides of the Pythagorean triangle (A046083(n), A046084(n), A009000(n)).
 * @author Sean A. Irvine
 */
public class A386306 extends Sequence1 {

  private final Sequence mA = new A046083();
  private final Sequence mB = new A046084();
  private final Sequence mC = new A009000();

  @Override
  public Z next() {
    return Functions.BIG_OMEGA.z(mA.next()).add(Functions.BIG_OMEGA.z(mB.next())).add(Functions.BIG_OMEGA.z(mC.next()));
  }
}
