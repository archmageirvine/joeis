package irvine.oeis.a033;

/**
 * A033061 Numbers n such that base 10 representation Sum{d(i)*10^i: i=0,1,...,m} has odd d(i) for all odd i.
 * @author Sean A. Irvine
 */
public class A033061 extends A033053 {

  @Override
  protected int base() {
    return 10;
  }
}
