package irvine.oeis.a037;

/**
 * A037878 (1/2)*Sum{|d(i)-e(i)|}, where Sum{d(i)*10^i} is base 10 representation of n and e(i) are digits d(i) in nonincreasing order, for i=0,1,...,m.
 * @author Sean A. Irvine
 */
public class A037878 extends A037870 {

  @Override
  protected int base() {
    return 10;
  }
}
