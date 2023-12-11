package irvine.oeis.a038;

import irvine.math.z.Z;
import irvine.oeis.a002.A002110;
import irvine.oeis.a002.A002808;
import irvine.oeis.memory.MemorySequence;

/**
 * A038773 a(n) is the smallest prime of the form Q + c, where Q is the n-th primorial and c is a composite &gt;= prime(n+1)^2.
 * @author Sean A. Irvine
 */
public class A038773 extends A002110 {

  private final MemorySequence mComposites = MemorySequence.cachedSequence(new A002808());
  {
    setOffset(1);
    super.next();
  }

  @Override
  public Z next() {
    final Z primorial = super.next();
    int k = -1;
    while (true) {
      final Z t = primorial.add(mComposites.a(++k));
      if (t.isProbablePrime()) {
        return t;
      }
    }
  }
}
