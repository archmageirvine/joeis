package irvine.oeis.a084;

import irvine.math.z.Z;

/**
 * A084579 Let y = m/GK(k), where m and k vary over the positive integers and GK(k)=log(1+1/(k*(k+2)))/log(2) is the Gauss-Kuzmin distribution of k. Sort the y values by size and number them consecutively by n. This sequence gives the values of m in order by n.
 * @author Sean A. Irvine
 */
public class A084579 extends A084577 {

  @Override
  protected Z select(final A084577.State s) {
    return Z.valueOf(s.mM);
  }
}

