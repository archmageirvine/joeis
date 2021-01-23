package irvine.oeis.a037;

/**
 * A037854 Sum_{i=1..m, d(i)&gt;d(i-1)} d(i)-d(i-1), where Sum_{i=0..m} d(i)*4^i is the base 4 representation of n.
 * @author Sean A. Irvine
 */
public class A037854 extends A037853 {

  @Override
  protected long base() {
    return 4;
  }
}
