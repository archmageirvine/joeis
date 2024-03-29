package irvine.oeis.a157;
// Generated by gen_seq4.pl A157147/parm3 at 2022-04-19 14:17

/**
 * A157148 Triangle T(n, k, m) = (m*(n-k) + 1)*T(n-1, k-1, m) + (m*k + 1)*T(n-1, k, m) + m*k*(n-k)*T(n-2, k-1, m) with T(n, 0, m) = T(n, n, m) = 1 and m = 2, read by rows.
 * @author Georg Fischer
 */
public class A157148 extends A157147 {

  /** Construct the sequence. */
  public A157148() {
    super(+1, 2);
  }
}
