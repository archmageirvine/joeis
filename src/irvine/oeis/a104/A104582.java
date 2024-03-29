package irvine.oeis.a104;
// Generated by gen_seq4.pl tritoep

import irvine.oeis.a000.A000071;
import irvine.oeis.triangle.ToeplitzTriangle;

/**
 * A104582 Triangle read by rows: T(i,j) is the (i,j)-entry (1 &lt;= j &lt;= i) of the product of the lower triangular matrix (Fibonacci(i-j+1)) and of the lower triangular matrix all of whose entries are equal to 1 (for j &lt;= i).
 * @author Georg Fischer
 */
public class A104582 extends ToeplitzTriangle {

  /** Construct the sequence. */
  public A104582() {
    super(1, new A000071().skip(2));
  }
}

