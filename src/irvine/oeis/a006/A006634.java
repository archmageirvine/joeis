package irvine.oeis.a006;

import java.util.ArrayList;

import irvine.math.group.PolynomialRing;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.a002.A002293;

/**
 * A006634.
 * @author Sean A. Irvine
 */
public class A006634 extends A002293 {

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private ArrayList<Z> mA = new ArrayList<>();
  private int mN = -1;

  @Override
  public Z next() {
    mA.add(super.next());
    return RING.pow(RING.create(mA), 9, ++mN).coeff(mN);
  }
}

