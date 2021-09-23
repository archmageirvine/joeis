package irvine.oeis.a051;

import java.io.IOException;

import irvine.math.z.Z;
import irvine.oeis.EuclidMullinSequence;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000040;

/**
 * A051615 Primes for which A051614 is 3.
 * @author Sean A. Irvine
 */
public class A051615 extends A000040 {

  @Override
  public Z next() {
    try {
      while (true) {
        final Z p = super.next();
        final Sequence seq = new EuclidMullinSequence(p);
        seq.next();
        seq.next();
        seq.next();
        if (Z.THREE.equals(seq.next())) {
          return p;
        }
      }
    } catch (final IOException e) {
      throw new RuntimeException(e);
    }
  }
}
