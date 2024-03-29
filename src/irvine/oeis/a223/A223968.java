package irvine.oeis.a223;
// Generated by gen_seq4.pl parm3 at 2021-10-17 19:44

import irvine.oeis.a216.A216201;
/**
 * A223968 Square array T, read by antidiagonals: T(n,k) = 0 if n-k &gt;= 5 or if k-n &gt;= 6, T(4,0) = T(3,0) = T(2,0) = T(1,0) = T(0,0) = T(0,1) = T(0,2) = T(0,3) = T(0,4) = T(0,5) = 1, T(n,k) = T(n-1,k) + T(n,k-1).
 * @author Georg Fischer
 */
public class A223968 extends A216201 {

  /** Construct the sequence. */
  public A223968() {
    super(4, 5);
  }
}
