package irvine.math.monoid;

import java.util.Arrays;

/**
 * Generate monoids.
 * @author Sean A. Irvine
 */
public class Monoids {

  // The generation here is very slow.
  // It might be better to attempt only generation of canonical cases,
  // or maybe the associativity checking could be made better.

  protected final int mN;
  protected final int[][] mM;

  /**
   * Construct a new object for generating monoids of given order.
   * @param n order
   * @exception IllegalArgumentException if <code>n</code> is not positive.
   */
  public Monoids(final int n) {
    if (n <= 0) {
      throw new IllegalArgumentException();
    }
    mN = n;
    mM = new int[n][n];
    // Element 0 is the identity
    for (int k = 1; k < n; ++k) {
      mM[0][k] = k;
      mM[k][0] = k;
    }
  }

  // Check associativity assuming everything up to given row is filled in
  protected boolean isAssociative(final int row) {
    // No need to check the identity
    for (int a = row; a > 0; --a) {
      for (int b = row; b > 0; --b) {
        final int left = mM[a][b];
        if (left <= row) {
          for (int c = 1; c < mN; ++c) {
            final int right = mM[b][c];
            if (right <= row && mM[left][c] != mM[a][right]) {
              return false;
            }
          }
        }
      }
    }
    return true;
  }

  protected void search(final MonoidProcessor processor, final int row, final int col) {
    if (row >= mN) {
      processor.process(mM);
      return;
    }
    // Choose possible element for (row, col)
    for (int k = 0; k < mN; ++k) {
      mM[row][col] = k;
      if (col == mN - 1) {
        if (isAssociative(row)) {
          search(processor, row + 1, 1);
        }
      } else {
        search(processor, row, col + 1);
      }
    }
  }

  /**
   * Generate monoids passing each constructed monoid to the processor.
   * @param processor monoid processor
   */
  public void generate(final MonoidProcessor processor) {
    search(processor, 1, 1);
  }

  /**
   * Print all monoids of a given order.
   * @param args arguments
   */
  public static void main(final String[] args) {
    final Monoids monoids = new Monoids(Integer.parseInt(args[0]));
    monoids.generate(monoid -> System.out.println(Arrays.deepToString(monoid)));
    //monoids.generate(new CanonicalMonoidProcessor(monoid -> System.out.println(Arrays.deepToString(monoid))));
  }
}
