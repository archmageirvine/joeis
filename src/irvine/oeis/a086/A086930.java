package irvine.oeis.a086;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence2;
import irvine.oeis.a065.A065091;

/**
 * A086930 Smallest b&gt;1 such that in base b representation the n-th prime is a repunit.
 * @author Sean A. Irvine
 */
public class A086930 extends Sequence2 {

  private final Sequence mS = new A065091();

  @Override
  public Z next() {
    final Z p = mS.next();
    long b = 1;
    while (true) {
      if (Predicates.REPUNIT.is(++b, p)) {
        return Z.valueOf(b);
      }
    }
  }
}
