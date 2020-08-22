package irvine.oeis.a022;

import irvine.math.cr.CR;

/**
 * A022161 First row of spectral array W(e-1).
 * @author Sean A. Irvine
 */
public class A022161 extends A022159 {

  private static final CR N = CR.E.subtract(CR.ONE);

  @Override
  protected CR h() {
    return N;
  }
}
