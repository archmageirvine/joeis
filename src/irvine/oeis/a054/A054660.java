package irvine.oeis.a054;

import irvine.math.z.Z;
import irvine.oeis.a000.A000048;

/**
 * A054660 Number of monic irreducible polynomials over GF(4) of degree n with fixed nonzero trace.
 * @author Sean A. Irvine
 */
public class A054660 extends A000048 {

  /** Construct the sequence. */
  public A054660() {
    super(1);
  }

  {
    super.next();
  }

  @Override
  public Z next() {
    super.next();
    return super.next();
  }
}

