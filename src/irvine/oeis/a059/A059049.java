package irvine.oeis.a059;

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A059049 Number of 6-element ordered T_0-antichains on an unlabeled n-set; T_1-hypergraphs on 6 labeled nodes with n (not necessary empty) distinct hyperedges (n=0,1,...,64).
 * @author Sean A. Irvine
 */
public class A059049 extends Sequence0 {

  private static final long[][] PARMS = {
    {1, 64},
    {-30, 48},
    {120, 40},
    {60, 36},
    {60, 34},
    {-12, 33},
    {-345, 32},
    {-720, 30},
    {810, 28},
    {120, 27},
    {480, 26},
    {360, 25},
    {-480, 24},
    {-720, 23},
    {-240, 22},
    {-540, 21},
    {1380, 20},
    {750, 19},
    {60, 18},
    {-210, 17},
    {-1535, 16},
    {-1820, 15},
    {2250, 14},
    {1800, 13},
    {-2820, 12},
    {300, 11},
    {2040, 10},
    {340, 9},
    {-1815, 8},
    {510, 7},
    {-1350, 6},
    {1350, 5},
    {274, 4},
    {-548, 3},
    {120, 2},
  };
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN > 64) {
      return null;
    }
    return Integers.SINGLETON.sum(0, PARMS.length - 1, k -> Binomial.binomial(PARMS[k][1], mN).multiply(PARMS[k][0]));
  }
}
