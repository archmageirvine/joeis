package irvine.oeis.a000;

import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.z.Z;

import java.util.ArrayList;

/**
 * A000635.
 * @author Sean A. Irvine
 */
public class A000635 extends A000642 {

  private final ArrayList<Q> mA642 = new ArrayList<>();

  @Override
  public Z next() {
    mA642.add(new Q(super.next()));
    final Polynomial<Q> b = RING.create(mA642);
    return RING.coeff(b, RING.subtract(RING.one(), b), mN).toZ();
  }
}

