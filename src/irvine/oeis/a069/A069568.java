package irvine.oeis.a069;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A069568 a(n) = smallest number m &gt; 0 such that n followed by m 1's yields a prime, or -1 if no such m exists.
 * @author Sean A. Irvine
 */
public class A069568 extends Sequence1 {

  // Better to refer to OEIS for state of the art here.
  // As of 2024 it appears 603 is first value of n where the solution is unknown.

  // Toshitaka Suzuki, first value is modulus, other values residues
  private static final long[][] NO_SOLUTION = {
    {10101,  37, 371, 3711, 4044, 5625, 5746, 6623, 6808, 6956, 7475, 8743, 8955},
    {3003,   176, 209, 1023, 1222, 1353, 1519, 1761, 1904, 1937, 2091, 2596, 2893},
    {8547,   407, 814, 936, 1750, 2146, 2739, 4071, 4367, 4488, 5402, 6523, 8141},
    {15873,  2739, 4070, 5809, 6623, 6930, 8955, 9483, 10186, 10472, 11518, 11804, 15466},
    {37037,  936, 1222, 9361, 10186, 11100, 12221, 18612, 19537, 26048, 27787, 35938, 36927},
    {11111111, 2096963, 2964654, 7424319, 7576525, 8074243, 9098585, 9696313, 9858520}
  };
  private static final long[] OTHERS_WITH_NO_SOLUTION = {
    38, 381, 3811, 4367, 13072, 38111, 43671, 130721, 381111, 429988, 436711, 1307211, 1497919, 3811111, 4299881, 4367111
  };
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    for (final long[] t : NO_SOLUTION) {
      final long r = mN % t[0];
      for (int k = 1; k < t.length; ++k) {
        if (t[k] == r) {
          return Z.NEG_ONE;
        }
      }
    }
    for (final long v : OTHERS_WITH_NO_SOLUTION) {
      if (v == mN) {
        return Z.NEG_ONE;
      }
    }
    Z s = Z.valueOf(mN);
    long m = 0;
    while (true) {
      ++m;
      s = s.multiply(10).add(1);
      if (s.isProbablePrime()) {
        return Z.valueOf(m);
      }
    }
  }
}
