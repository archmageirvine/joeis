package irvine.oeis.a033;

/**
 * A033057 Numbers n such that base 6 representation Sum{d(i)*6^i: i=0,1,...,m} has odd d(i) for all odd i.
 * @author Sean A. Irvine
 */
public class A033057 extends A033053 {

  @Override
  protected int base() {
    return 6;
  }
}
