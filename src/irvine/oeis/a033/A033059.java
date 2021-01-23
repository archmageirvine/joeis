package irvine.oeis.a033;

/**
 * A033059 Numbers n such that base 8 representation Sum{d(i)*8^i: i=0,1,...,m} has odd d(i) for all odd i.
 * @author Sean A. Irvine
 */
public class A033059 extends A033053 {

  @Override
  protected int base() {
    return 8;
  }
}
