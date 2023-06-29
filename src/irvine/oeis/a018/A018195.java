package irvine.oeis.a018;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A018195 Possible numbers of complements of topologies on 4 points.
 * The following table shows the terms.
 * <a href="http://dx.doi.org/10.1016/0012-365X(95)00004-G">Topologies</a>
 * <pre>
 * # Corollary 3.9. The possible numbers of complements of topologies on n points are
 * m   =1  m-1 ^2
 * 4   1   3   4   7       12      14      15      16      |   2^2     3*4?    2*7?            2^3-1   2^4
 * 5   1   4   8   9       15      32                      |   3^2     2^3     2^3=    3^2=    2^4-1   2^5
 * 6   1   5   16  27      31      64                      |   4^2     2^4=    3^3     3^3=    2^5-1   2^6
 * 7   1   6   25  32      63      64      81      128     |   5^2     2^5     4^3     3^4     2^6-1   2^7
 * 8   1   7   36  64      125     127     243     256     |   6^2     2^6     5^3     3^5     2^7-1   2^8
 * 9   1   8   49  128     216     255     512             |   7^2     2^7     6^3             2^8-1   2^9
 * 10  1   9   64  256     343     511     1024            |   8^2     2^8     7^3             2^9-1   2^10
 * 11  1   10  81  512     1023    2048                    |   9^2     2^9     8^3=            2^10-1  2^11
 * 12  1   11  100 729     2047    4096                    |   10^2    ??      9^3     8^4=    2^11-1  2^12
 * 13  1   12  121 1000    2048    4095    6561    8192    |   11^2    2^11    10^3    3^8?    2^12-1  2^13
 * a(1) = 1
 * a(2) = m - 1
 * a(3) = (m-2)^2
 * </pre>
 * @author Georg Fischer
 */
public class A018195 extends Sequence0 {

  private final TreeSet<Z> mSet = new TreeSet<>();
  protected int mN;
  private int mPoints;

  /** Construct the sequence. */
  public A018195() {
    this(4);
  }

  /**
   * Generic constructor with parameters
   * @param points number of points
   */
  public A018195(final int points) {
    mPoints = points;
    mN = 0;
    mSet.add(Z.ONE);
    mSet.add(Z.valueOf(mPoints - 1));
    mSet.add(Z.valueOf(mPoints - 2).square());
    final Z limit = Z.ONE.shiftLeft(mPoints);
    mSet.add(limit);
    mSet.add(Z.ONE.shiftLeft(mPoints - 1).subtract(1));
    int k = 2;
    int j = mPoints - 2;
    Z kj = Z.ONE.shiftLeft(j);
    while (j >= 2) {
      if (kj.compareTo(limit) < 0) {
        mSet.add(kj);
      }
      ++k;
      --j;
      kj = Z.valueOf(k).pow(j);
    }
    switch (mPoints) {
      case 4:
        mSet.add(Z.valueOf(12));
        mSet.add(Z.valueOf(14));
        mSet.add(Z.valueOf(15));
        break;
      case 13:
        mSet.add(Z.THREE.pow(8));
        break;
      case 12:
        mSet.remove(Z.TWO.pow(10));
        break;
      default:
        break;
    }
  }

  @Override
  public Z next() {
    ++mN;
    Z result = mSet.pollFirst();
    if (result == null) {
      ++mPoints;
      result = Z.ONE.shiftLeft(mPoints);
    }
    return result;
  }
}
