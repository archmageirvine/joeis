package irvine.oeis.a023;

/**
 * A023420 a(n) = c([ n/2 ]) + c([ n/3 ]) + ... + c([ n/n ]) for n &gt;=3, where a(1) = 1, a(2) = 3 and c(n) = n-th number not in sequence a( ).
 * @author Sean A. Irvine
 */
public class A023420 extends A023419 {

  @Override
  protected long b() {
    return 3;
  }
}
