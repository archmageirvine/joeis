package irvine.math.factorial;

import java.util.HashSet;

import irvine.factor.prime.Fast;
import irvine.math.LongUtils;
import irvine.math.z.Z;


/**
 * Routine to find the first solution to a Brocard type problem.
 * That is, attempts to find the first solution to x!+a=m^2 or
 * return 0 if no such solution exists.
 *
 * @author Sean A. Irvine
 */
public final class Brocard  {

  /** Prevent instantiation. */
  private Brocard() { }

  private static final int SQR_LIMIT = 1000000;
  private static final Z SQR_LIMIT_SQ = Z.valueOf(SQR_LIMIT).square();

  private static final HashSet<Z> SQUARES = new HashSet<>();
  static {
    Z sq = Z.ONE;
    int n = 1;
    for (int i = 0; i < SQR_LIMIT; ++i) {
      SQUARES.add(sq);
      n += 2;
      sq = sq.add(n);
    }
  }

  /**
   * Find the smallest positive x satisfying x!+a=m^2.  If no such
   * solution exists returns 0.
   *
   * @param a value
   * @return smallest solution or 0
   */
  public static int brocard(final int a) {
    int x = 1;
    Z f = Z.ONE;
    final int sqrta = (int) Math.sqrt(a);
    if (sqrta * sqrta == a) {
      // nondeterministic case
      while (SQR_LIMIT_SQ.compareTo(f) > 0) {
        if (SQUARES.contains(f.add(a))) {
          return x;
        }
        f = f.multiply(++x);
      }
    } else {
      // if there is a solution it occurs before jacobi(a,p)=-1
      final Fast p = new Fast();
      while (x == 2 || !p.isPrime(x) || LongUtils.jacobi(a, x) != -1) {
        if (SQUARES.contains(f.add(a))) {
          return x;
        }
        f = f.multiply(++x);
      }
    }
    return 0;
  }

  /**
   * Sequentially try each value of a.
   *
   * @param args ignored
   */
  public static void main(final String[] args) {
    int a = 0;
    while (a < 1000) {
      System.out.println(a + " " + brocard(a));
      ++a;
    }
  }
}

