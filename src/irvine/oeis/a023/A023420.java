package irvine.oeis.a023;

/**
 * A023420 <code>a(n) = c([ n/2 ]) + c([ n/3 ]) +</code> ... <code>+ c([ n/n ])</code> for <code>n &gt;=3</code>, where <code>a(1) = 1, a(2) = 3</code> and <code>c(n) = n-th</code> number not in sequence <code>a( )</code>.
 * @author Sean A. Irvine
 */
public class A023420 extends A023419 {

  @Override
  protected long b() {
    return 3;
  }
}
