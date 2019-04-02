package irvine.oeis.a008;

import java.util.ArrayList;
import java.util.List;

import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.PrependSequence;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000594;
import irvine.oeis.a004.A004009;

/**
 * A008408 Theta series of Leech lattice.
 * @author Sean A. Irvine
 */
public class A008408 extends A004009 {

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private Sequence mA = new PrependSequence(new A000594(), Z.ZERO);
  private List<Z> mA004009 = new ArrayList<>();

  @Override
  public Z next() {
    final int n = mA004009.size();
    mA004009.add(super.next());
    final Polynomial<Z> gf = RING.pow(RING.create(mA004009), 3, n);
    return gf.coeff(n).subtract(mA.next().multiply(720));
  }
}


