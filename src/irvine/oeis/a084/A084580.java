package irvine.oeis.a084;

import irvine.math.MemoryFunction1;
import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.a386.A386016;

/**
 * A084580 Let y = m/GK(k), where m and k vary over the positive integers and GK(k)=log(1+1/(k*(k+2)))/log(2) is the Gauss-Kuzmin distribution of k. Sort the y values by size and number them consecutively by n. This sequence gives the values of k in order by n.
 * @author Sean A. Irvine
 */
public class A084580 extends A386016 {

  /** Construct the sequence. */
  public A084580() {
    super(new MemoryFunction1<>() {
      @Override
      protected CR compute(final int n) {
        return n == 0 ? CR.ZERO : CR.valueOf(Q.ONE.add(new Q(1, n * (n + 2L)))).log().divide(CR.LOG2);
      }
    });
  }
}

