package irvine.oeis.a143;

/**
 * A143498 Triangle of unsigned 3-Lah numbers.
 * Recurrence: <code>T(n,k) = (n+k-1)*T(n-1,k) + T(n-1,k-1) for n,k &gt;= 3</code>.
 * @author Georg Fischer
 */
public class A143498 extends A143497 {

  /** Construct the sequence. */
  public A143498() {
    super(3);
  }
}
