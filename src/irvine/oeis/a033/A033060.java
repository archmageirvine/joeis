package irvine.oeis.a033;

/**
 * A033060 Numbers n such that base 9 representation Sum{d(i)*9^i: i=0,1,...,m} has odd d(i) for all odd i.
 * @author Sean A. Irvine
 */
public class A033060 extends A033053 {

  @Override
  protected int base() {
    return 9;
  }
}
