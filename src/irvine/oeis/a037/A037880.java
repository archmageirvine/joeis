package irvine.oeis.a037;

/**
 * A037880 (1/2)*Sum{|d(i)-e(i)|} where Sum{d(i)*3^i) is base 3 representation of n and e(i) are digits d(i) in nondecreasing order.
 * @author Sean A. Irvine
 */
public class A037880 extends A037879 {

  @Override
  protected int base() {
    return 3;
  }
}
