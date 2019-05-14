package irvine.oeis.a022;

import irvine.math.cr.CR;

/**
 * A022165 First row of spectral array <code>W(sqrt(5)-1)</code>.
 * @author Sean A. Irvine
 */
public class A022165 extends A022159 {

  private static final CR N = CR.FIVE.sqrt().subtract(CR.ONE);

  @Override
  protected CR h() {
    return N;
  }
}
