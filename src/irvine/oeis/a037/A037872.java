package irvine.oeis.a037;

/**
 * A037872 (1/2)*Sum{|d(i)-e(i)|}, where Sum{d(i)*4^i} is base 4 representation of n and e(i) are digits d(i) in nonincreasing order, for i=0,1,...,m.
 * @author Sean A. Irvine
 */
public class A037872 extends A037870 {

  @Override
  protected int base() {
    return 4;
  }
}
