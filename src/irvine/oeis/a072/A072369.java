package irvine.oeis.a072;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000578;

/**
 * A072369 Cubes x such that x + reverse of x is a prime.
 * @author Sean A. Irvine
 */
public class A072369 extends Sequence1 {

  private final Sequence mCubes = new A000578().skip();

  @Override
  public Z next() {
    while (true) {
      final Z cube = mCubes.next();
      if (cube.add(Functions.REVERSE.z(cube)).isProbablePrime()) {
        return cube;
      }
    }
  }
}
