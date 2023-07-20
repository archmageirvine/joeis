package irvine.oeis.a038;

import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;
import irvine.oeis.a002.A002110;
import irvine.oeis.a002.A002808;

/**
 * A038771 a(n) is the smallest composite number c such that A002110(n) + c is prime.
 * @author Sean A. Irvine
 */
public class A038771 extends A002110 {

  private final MemorySequence mComposites = MemorySequence.cachedSequence(new A002808());

  @Override
  public Z next() {
    final Z primorial = super.next();
    int k = -1;
    while (true) {
      final Z c = mComposites.a(++k);
      if (primorial.add(c).isProbablePrime()) {
        return c;
      }
    }
  }
}
