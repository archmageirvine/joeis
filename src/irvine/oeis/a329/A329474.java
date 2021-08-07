package irvine.oeis.a329;
// manually A049884 at 2021-08-07

import irvine.oeis.a050.A050024;

/**
 * A329474 a(n) = log_2(A110428(n)). Also, a(n) = a(n-1) + a(m) for n &gt;= 3, where m = 2^(p+1) + 2 - n and p is the unique integer such that 2^p &lt; n - 1 &lt;= 2^(p+1), starting with a(1) = 0 and a(2) = 1.
 * and p is the unique integer such that 2^p &lt; n - 1 &lt;= 2^(p+1), 
 * starting with a(1) = 0 and a(2) = 1
 * @author Georg Fischer
 */
public class A329474 extends A050024 {

  /** Construct the sequence */
  public A329474() {
    super(+1, 0, 1);
  }
  
  @Override
  public int getM(final int n) {
    return p1(n) + 2 - n;
  }
}

