package irvine.oeis.a211;
// Generated by gen_seq4.pl A211266/parmof3 at 2022-02-02 22:52

/**
 * A211262 Number of integer pairs (x,y) such that 0&lt;x&lt;y&lt;=n and x*y=3n.
 * @author Georg Fischer
 */
public class A211262 extends A211266 {

  /** Construct the sequence. */
  public A211262() {
    super(1, 1, (n, x, y) -> x * y == 3 * n);
  }
}
