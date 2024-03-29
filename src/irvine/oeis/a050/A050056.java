package irvine.oeis.a050;
// Generated by gen_seq4.pl A049884 at 2021-08-08 00:55

/**
 * A050056 a(n) = a(n-1) + a(m) for n &gt;= 4, where m = 2*n - 3 - 2^(p+1) and p is the unique integer such that 2^p &lt; n - 1 &lt;= 2^(p+1), starting with a(1) = 1, a(2) = 3, and a(3) = 1.
 * @author Georg Fischer
 */
public class A050056 extends A050024 {

  /** Construct the sequence. */
  public A050056() {
    super(+1, 1, 3, 1);
  }
  
  @Override
  public int getM(final int n) {
    return 2 * n - 3 - p1(n);
  }
}

