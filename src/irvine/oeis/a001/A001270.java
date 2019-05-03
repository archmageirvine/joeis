package irvine.oeis.a001;

import irvine.math.z.Z;

/**
 * A001270 Table of prime factors of <code>10^n - 1 (with multiplicity)</code>.
 * @author Sean A. Irvine
 */
public class A001270 extends A001265 {

  {
    super.next();
  }

  @Override
  protected Z base() {
    return Z.TEN;
  }
}
