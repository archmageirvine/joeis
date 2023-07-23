package irvine.oeis.a000;

import java.util.ArrayList;

import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A000635 Number of paraffins C_n H_{2n} X Y with n carbon atoms.
 * @author Sean A. Irvine
 */
public class A000635 extends A000642 {

  {
    setOffset(0);
  }

  private final ArrayList<Q> mA642 = new ArrayList<>();

  @Override
  public Z next() {
    mA642.add(new Q(super.next()));
    final Polynomial<Q> b = RING.create(mA642);
    return RING.coeff(b, RING.subtract(RING.one(), b), mN).toZ();
  }
}

