package irvine.oeis.a048;

/**
 * A048937 Numbers n with an even number of digits, n = d_1 d_2 ... d_n, such that there are exactly three ways to partition the digits into two groups of size n/2, say f_1 ... f_{n/2} and g_1 ... g_{n/2}, such that n = f_1 ... f_{n/2} * g_1 ... g_{n/2}.
 * @author Sean A. Irvine
 */
public class A048937 extends A048936 {

  @Override
  protected int target() {
    return 3;
  }
}
