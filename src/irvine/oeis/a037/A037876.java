package irvine.oeis.a037;

/**
 * A037876 (1/2)*Sum{|d(i)-e(i)|}, where Sum{d(i)*8^i} is base 8 representation of n and e(i) are digits d(i) in nonincreasing order, for i=0,1,...,m.
 * @author Sean A. Irvine
 */
public class A037876 extends A037870 {

  @Override
  protected int base() {
    return 8;
  }
}
