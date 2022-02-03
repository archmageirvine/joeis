package irvine.oeis.a143;

/**
 * A143499 Triangle of unsigned 4-Lah numbers.
 * Recurrence: <code>T(n,k) = (n+k-1)*T(n-1,k) + T(n-1,k-1) for n,k &gt;= 4</code>.
 * @author Georg Fischer
 */
public class A143499 extends A143497 {

  /** Construct the sequence. */
  public A143499() {
    super(4);
  }
}
