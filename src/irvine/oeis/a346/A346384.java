package irvine.oeis.a346;

/**
 * A346384 Triangle read by rows. T(n,k) is the number of invertible n X n matrices over GF(3) such that the dimension of the eigenspace corresponding to the eigenvalue 1 is k, 0 &lt;= k &lt;= n, n &gt;= 0.
 * @author Gregory Morse
 */
public class A346384 extends A346381 {

  /** Construct the sequence. */
  public A346384() {
    super(3);
  }
}
