package irvine.oeis.a037;

/**
 * A037849 a(n) = Sum_{d(i) &lt; d(i-1), i=1..m} (d(i-1) - d(i)), where Sum{d(i)*8^i: i=0,1,...,m} is the base-8 representation of n.
 * @author Sean A. Irvine
 */
public class A037849 extends A037844 {

  @Override
  protected long base() {
    return 8;
  }
}
