package irvine.oeis.a037;

/**
 * A037808 Number of i such that d(i)&lt;d(i-1), where Sum{d(i)*10^i: i=0,1,...,m} is base 10 representation of n.
 * @author Sean A. Irvine
 */
public class A037808 extends A037801 {

  @Override
  protected long base() {
    return 10;
  }
}
