package irvine.oeis.a037;

/**
 * A037877 (1/2)*Sum{|d(i)-e(i)|}, where Sum{d(i)*9^i} is base-9 representation of n and e(i) are digits d(i) in nonincreasing order, for i=0,1,...,m.
 * @author Sean A. Irvine
 */
public class A037877 extends A037870 {

  @Override
  protected int base() {
    return 9;
  }
}
