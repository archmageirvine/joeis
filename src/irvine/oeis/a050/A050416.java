package irvine.oeis.a050;
// manually parm3 at 2021-08-06

/**
 * A050416 a(1)=a(2)=1, then a(n+1) = floor(a(n)/3) if this is not among 0, a(1), ..., a(n); otherwise a(n+1) = a(n) + a(n-1).
 * @author Georg Fischer
 */
public class A050416 extends A050196 {

  /** Construct the sequence. */
  public A050416() {
    super(99, 3);
  }
}
