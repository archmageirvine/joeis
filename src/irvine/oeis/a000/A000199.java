package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A000199 Coefficient of q^(2n-1) in the series expansion of Ramanujan's mock theta function f(q).
 * @author Sean A. Irvine
 */
public class A000199 extends Sequence1 {

  private final A000025 mF = new A000025();

  @Override
  public Z next() {
    mF.next();
    return mF.next();
  }
}

