package irvine.oeis.a076;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000040;
import irvine.oeis.a000.A000290;
import irvine.oeis.a078.A078142;

/**
 * A076830 Least square s such that A078142(s) is equal to the n-th prime.
 * @author Sean A. Irvine
 */
public class A076830 extends A000040 {

  private final DirectSequence mA078142 = new A078142();

  @Override
  public Z next() {
    final Z p = super.next();
    final Sequence squares = new A000290();
    while (true) {
      final Z s = squares.next();
      if (mA078142.a(s).equals(p)) {
        return s;
      }
    }
  }
}
