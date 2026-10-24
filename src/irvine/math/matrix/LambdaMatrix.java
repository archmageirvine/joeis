package irvine.math.matrix;

import java.util.function.BiFunction;

/**
 * A matrix with elements (i, j) defined by a lambda expression.
 * @author Georg Fischer
 * @param <E> element type
 */
public class LambdaMatrix<E> extends DefaultMatrix<E> {

  /**
   * Construct the matrix by mapping (i, j) (1-based) to some Q expression.
   * @param rows number of rows
   * @param cols number of columns
   * @param zero zero element
   * @param lambda expression mapping (i, j) to a Q expression
   */
  public LambdaMatrix(final long rows, final long cols, final E zero, final BiFunction<Long, Long, E> lambda) {
    this(rows, cols, zero, lambda, 1);
  }

  /**
   * Construct the matrix by mapping (i, j) to some Q expression.
   * @param rows number of rows
   * @param cols number of columns
   * @param zero zero element
   * @param lambda expression mapping (i, j) to a Q expression
   * @param base 0-based:  <code>0 &lt;= i &lt;= rows - 1</code> and <code>0 &lt;= j &lt;= cols - 1</code>,
   * or 1-based: <code>1 &lt;= i &lt;= rows</code> and <code>1 &lt;= j &lt;= cols</code>.
   */
  public LambdaMatrix(final long rows, final long cols, final E zero, final BiFunction<Long, Long, E> lambda, final int base) {
    super(rows, cols, zero);
    for (long r = 0; r < rows; ++r) {
      for (long c = 0; c < cols; ++c) {
        set(r, c, lambda.apply(r + base, c + base));
      }
    }
  }
}
