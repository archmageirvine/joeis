package irvine.oeis.a079;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A079922 Solution to the Dancing School Problem with n girls and n+3 boys: f(n, 3).
 * @author Georg Fischer
 */
public class A079922 implements Sequence {

  protected int mN; // current index
  protected int mP; // parameter
  
  /** Construct the sequence */
  public A079922() {
    this(3);
  }
  
  /**
   * Generic constructor with parameter
   * @param p 2nd parameter of function f
   */
  public A079922(int p) {
    mP = p;
    mN = 0;
  }

  private static long permanent(final long[][] mat) {
    // Using Ryser inclusion-exclusion method
    final int n = mat.length;
    if (n == 0) {
      return 0;
    }
    final int m = mat[0].length;
    if (n > 64) {
      throw new UnsupportedOperationException();
    }
    long sum = 0;
    for (long s = 1; s < 1L << m; ++s) { // todo start s=1 ??
      // s is a bit vector showing elements of column to include
      long prod = 1;
      for (int i = 0; i < n && prod != 0; ++i) {
        long sj = s;
        long t = 0;
        for (int j = 0; sj != 0; ++j, sj >>>= 1) {
          if ((sj & 1) == 1) {
            t += mat[i][j];
          }
        }
        prod *= t;
      }
      final int sizeS = Long.bitCount(s);
      prod *= Binomial.binomial(m - n + sizeS, sizeS).longValueExact();
      sum += (sizeS & 1) == 0 ? prod : -prod;
      //System.out.println("sum=" + sum);
    }
    return (m & 1) == 0 ? sum : -sum;
  }

  /**
   * Compute the function f 
   * @param g first parameter
   * @param h second parameter
   */
  /*  
        cf. http://www.jaapspies.nl/oeis/ds.sage
        m = g
        n = m + h
        M = MatrixSpace(QQ, m, n)
        for i in range(m):
            for j in range(n):
                if i <= j and j <= i + h:
                    A[i,j] = 1
        return A.permanent()
  */
  protected Z compute(final int g, final int h) {
    final int m = g;
    final int n = m + h;
    final long[][] dance = new long[m][n];
    for (int i = 0; i < m; ++i) {
      for (int j = 0; j < n; ++j) {
        if (i <= j && j <= i + h) {
            dance[i][j] = 1;
        }
      }
    }
    return Z.valueOf(permanent(dance));
  }
  
  @Override
  public Z next() {
    //System.out.println(permanent(new long[][] {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}})); // this matrix has permanent 450
    return compute(++mN, mP);
  }

  /**
   * Test program for f(g,h)
   * @param args g h
   */
  public static void main(final String[] args) {
    if (args.length == 0) {
      System.out.println("Usage: java -cp joeis.jar irvine.oeis.a079.A079922 g h");
    } else {
      int iarg = 0;
      int g = 16;
      int h = 12;
      try {
        g = Integer.parseInt(args[iarg++]);
        h = Integer.parseInt(args[iarg++]);
      } catch (Exception exc) {
        // ignore, take defaults
      }
      System.out.println("f(" + g + "," + h + ") = " + (new A079922()).compute(g, h));
    }
  }

}
