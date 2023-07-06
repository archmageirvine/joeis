package irvine.oeis.a328;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence3;
import irvine.oeis.a025.A025586;

/**
 * A328147 a(n) = A025586(n)/4 for n&gt;=3.
 * @author Georg Fischer
 */
public class A328147 extends Sequence3 {

  final Sequence mA025586 = new A025586().skip(2);

  @Override
  public Z next() {
    return mA025586.next().divide(Z.FOUR);
  }
}
