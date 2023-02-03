package irvine.oeis.a059;

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A059050 Number of 7-element ordered T_0-antichains on an unlabeled n-set; T_1-hypergraphs on 7 labeled nodes with n (not necessarily empty) distinct hyperedges (n=0,1,...,128).
 * @author Sean A. Irvine
 */
public class A059050 extends Sequence0 {

  protected static final long[][] PARMS = {
    {1, 128},
    {-42, 96},
    {210, 80},
    {140, 72},
    {210, 68},
    {-84, 66},
    {14, 65},
    {-819, 64},
    {-2520, 60},
    {2730, 56},
    {840, 54},
    {840, 52},
    {-420, 51},
    {2940, 50},
    {630, 48},
    {-5040, 46},
    {840, 45},
    {-1260, 44},
    {1680, 43},
    {-9660, 42},
    {1260, 41},
    {3360, 40},
    {-7560, 39},
    {11130, 38},
    {5880, 37},
    {9240, 36},
    {2982, 35},
    {-6300, 34},
    {-8652, 33},
    {-9905, 32},
    {-8400, 31},
    {-8540, 30},
    {13860, 29},
    {14490, 28},
    {-5040, 27},
    {10500, 26},
    {10080, 25},
    {-8120, 24},
    {-15050, 23},
    {-5040, 22},
    {-11340, 21},
    {20580, 20},
    {15750, 19},
    {-1540, 18},
    {-5810, 17},
    {-16485, 16},
    {-21420, 15},
    {26250, 14},
    {21000, 13},
    {-29820, 12},
    {3500, 11},
    {17640, 10},
    {2940, 9},
    {-16016, 8},
    {4410, 7},
    {-9744, 6},
    {9744, 5},
    {1764, 4},
    {-3528, 3},
    {720, 2},
  };
  private long mN = -1;

  @Override
  public Z next() {
    if (++mN > 128) {
      return null;
    }
    return Integers.SINGLETON.sum(0, PARMS.length - 1, k -> Binomial.binomial(PARMS[k][1], mN).multiply(PARMS[k][0]));
  }
}
