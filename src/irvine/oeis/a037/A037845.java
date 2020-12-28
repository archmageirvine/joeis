package irvine.oeis.a037;

/**
 * A037845 a(n) = Sum_{i=1..m, d(i)&lt;d(i-1)} d(i-1)-d(i), where Sum_{i=0..m} d(i)*4^i is the base 4 representation of n.
 * @author Sean A. Irvine
 */
public class A037845 extends A037844 {

  @Override
  protected long base() {
    return 4;
  }
}
