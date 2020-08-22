package irvine.oeis.a033;

/**
 * A033063 Numbers n such that base 12 representation Sum{d(i)*12^i: i=0,1,...,m} has odd d(i) for all odd i.
 * @author Sean A. Irvine
 */
public class A033063 extends A033053 {

  @Override
  protected int base() {
    return 12;
  }
}
