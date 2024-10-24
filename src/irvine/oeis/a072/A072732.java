package irvine.oeis.a072;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a002.A002262;
import irvine.oeis.a025.A025581;

/**
 * A072555.
 * @author Sean A. Irvine
 */
public class A072732 extends Sequence0 {

  private final Sequence mA025581 = new A025581();
  private final Sequence mA002262 = new A002262();

  private Z packA001477(final Z x, final Z y) {
    return x.add(y).square().add(x).add(y.multiply(3)).divide2();
  }

  private Z packA072732(final Z x, final Z y) {
    final Z xmy = x.subtract(y);
    if (xmy.signum() <= 0) {
      return packA001477(x.multiply2().add(xmy.mod(Z.TWO)), x.multiply2().add(Z.ONE.subtract(xmy).divide2()));
    } else {
      return packA001477(y.add(1).multiply2().add(new Q(xmy.subtract(2), 2).floor()), y.multiply2().add(xmy.add(1).mod(Z.TWO)));
    }
  }

  @Override
  public Z next() {
    return packA072732(mA025581.next(), mA002262.next());
  }
}
