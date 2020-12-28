package irvine.oeis.a037;

/**
 * A037873 (1/2)*Sum{|d(i)-e(i)|}, where Sum{d(i)*5^i} is base 5 representation of n and e(i) are digits d(i) in nonincreasing order, for i=0,1,...,m.
 * @author Sean A. Irvine
 */
public class A037873 extends A037870 {

  @Override
  protected int base() {
    return 5;
  }
}
