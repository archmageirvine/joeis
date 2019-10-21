package irvine.oeis.a309;

import irvine.oeis.a006.A006776;

/**
 * A309982 Number of counterclockwise n-step spirals on hexagonal lattice where turns of <code>2*Pi/3</code> are forbidden.
 * @author Sean A. Irvine
 */
public class A309982 extends A006776 {

  @Override
  protected int model() {
    return 2;
  }
}
