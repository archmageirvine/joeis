package irvine.oeis.a037;

/**
 * A037871 (1/2)*Sum{|d(i)-e(i)|}, where Sum{d(i)*3^i} is base 3 representation of n and e(i) are digits d(i) in nonincreasing order, for i=0,1,...,m.
 * @author Sean A. Irvine
 */
public class A037871 extends A037870 {

  @Override
  protected int base() {
    return 3;
  }
}
