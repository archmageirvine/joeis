package irvine.oeis.a033;

/**
 * A033066 Numbers n such that base 15 representation Sum{d(i)*15^i: i=0,1,...,m} has odd d(i) for all odd i.
 * @author Sean A. Irvine
 */
public class A033066 extends A033053 {

  @Override
  protected int base() {
    return 15;
  }
}
