package irvine.oeis.a076;

/**
 * A076262 Triangle T(n,k) (n &gt;= 2, 1 &lt;= k &lt;= n-1) read by rows, where T(n,k) is the number of words of length n in the free group on three generators that require exactly k multiplications for their formation.
 * @author Sean A. Irvine
 */
public class A076262 extends A076261 {

  /** Construct the sequence. */
  public A076262() {
    super("a", "b", "c");
  }
}
