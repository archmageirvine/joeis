package irvine.oeis.a071;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.a000.A000037;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A071989 a(n) = n-th decimal digit of the fractional part of the square root of the n-th nonsquare number (A000037).
 * @author Sean A. Irvine
 */
public class A071989 extends A000037 {

  private int mN = -1;

  @Override
  public Z next() {
    return new DecimalExpansionSequence(CR.valueOf(super.next()).sqrt().frac()).skip(++mN).next();
  }
}
