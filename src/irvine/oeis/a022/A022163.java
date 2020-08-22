package irvine.oeis.a022;

import irvine.math.cr.CR;
import irvine.math.q.Q;

/**
 * A022163 First row of spectral array W(sqrt(3/2)).
 * @author Sean A. Irvine
 */
public class A022163 extends A022159 {

  private static final CR N = CR.valueOf(new Q(3, 2)).sqrt();

  @Override
  protected CR h() {
    return N;
  }
}
