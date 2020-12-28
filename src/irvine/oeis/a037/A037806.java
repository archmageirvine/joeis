package irvine.oeis.a037;

/**
 * A037806 Number of i such that d(i)&lt;d(i-1), where Sum{d(i)*8^i: i=0,1,...,m} is the base 8 representation of n.
 * @author Sean A. Irvine
 */
public class A037806 extends A037801 {

  @Override
  protected long base() {
    return 8;
  }
}
