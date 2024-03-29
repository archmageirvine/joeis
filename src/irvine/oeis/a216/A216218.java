package irvine.oeis.a216;
// Generated by gen_seq4.pl parm3 at 2021-10-17 19:44

/**
 * A216218 Square array T, read by antidiagonals: T(n,k) = 0 if n-k&gt;=2 or if k-n&gt;=2, T(1,0) = T(0,0) = T(0,1) = 1, T(n,k) = T(n-1,k) + T(n,k-1).
 * @author Georg Fischer
 */
public class A216218 extends A216201 {

  /** Construct the sequence. */
  public A216218() {
    super(1, 1);
  }
}
