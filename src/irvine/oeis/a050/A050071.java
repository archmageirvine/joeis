package irvine.oeis.a050;
// manually A049884 at 2021-08-07

/**
 * A050071 a(n) = a(n-1)+a(m), where m=2n-2-2^(p+1) and 2^p&lt;n-1&lt;=2^(p+1), for n &gt;= 4.
 * @author Georg Fischer
 */
public class A050071 extends A050024 {

  /** Construct the sequence. */
  public A050071() {
    super(+1, 1, 3, 4);
  }
  
  @Override
  public int getM(final int n) {
    return 2 * n - 2 - p1(n);
  }
}

