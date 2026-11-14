package irvine.oeis.a087;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000045;

/**
 * A399911.
 * @author Sean A. Irvine
 */
public class A087384 extends Sequence1 {

  private final Sequence mF = new A000045().skip();

  @Override
  public Z next() {
    final Z m = mF.next();
    Z t = m.add(1);
    while (!t.isProbablePrime()) {
      t = t.add(m);
    }
    return t;
  }
}

