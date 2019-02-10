package irvine.math.partitions;

import irvine.factor.factor.PrimeDivision;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;

/**
 * Compute the number of Smarandache factor partitions based on a method
 * described by Amarnath Murphy and Charles Ashbacher in "Generalized
 * Partitions and New Ideas On Number Theory and Smarandache Sequences"
 *
 * @author Sean A. Irvine
 */
public final class SmarandacheFactorPartition {

  private SmarandacheFactorPartition() { }

  private static long count(final Z[] d, final int pos, final int i, final Z prod) {
    long total = 0;
    final Z n = d[d.length - 1];
    for (int k = i; k < d.length; ++k) {
      final Z newProd = prod.multiply(d[k]);
      final int pp = pos + 1;
      if (newProd.equals(n)) {
        ++total;
        break;
      } else if (newProd.compareTo(n) < 0) {
        total += count(d, pp, k, newProd);
      }
    }
    return total;
  }

  /**
   * Compute number of Smarandache factor partitions of <code>2^n*3^m</code>.
   *
   * @param n powers of 2
   * @param m powers of 3
   * @return partition count
   */
  public static long count(final int n, final int m) {
    final FactorSequence fs = new FactorSequence();
    fs.add(2, FactorSequence.PRIME, n);
    fs.add(3, FactorSequence.PRIME, m);
    return count(fs.divisorsSorted(), 0, 1, Z.ONE);
  }

  /**
   * Compute number of Smarandache factor partitions of <code>n</code>.
   *
   * @param n number
   * @return partition count
   */
  public static long count(final Z n) {
    final FactorSequence fs = new FactorSequence(n);
    new PrimeDivision().factor(fs);
    if (!fs.isComplete()) {
      throw new UnsupportedOperationException();
    }
    return count(fs.divisorsSorted(), 0, 1, Z.ONE);
  }

  /**
   * Compute numbers of Smarandache factor partitions.
   *
   * @param args a <code>String</code> value
   */
  public static void main(final String[] args) {
    if (args.length == 2) {
      System.out.println(count(Integer.parseInt(args[0]), Integer.parseInt(args[1])));
    } else {
      System.out.println(count(new Z(args[0])));
    }
  }
}

