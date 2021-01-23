package irvine.oeis.a037;

/**
 * A037875 (1/2)*Sum{|d(i)-e(i)|}, where Sum{d(i)*7^i} is base 7 representation of n and e(i) are digits d(i) in nonincreasing order, for i=0,1,...,m.
 * @author Sean A. Irvine
 */
public class A037875 extends A037870 {

  @Override
  protected int base() {
    return 7;
  }
}
