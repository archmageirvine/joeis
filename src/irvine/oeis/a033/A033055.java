package irvine.oeis.a033;

/**
 * A033055 Numbers n such that base 4 representation Sum{d(i)*4^i: i=0,1,...,m} has odd d(i) for all odd i.
 * @author Sean A. Irvine
 */
public class A033055 extends A033053 {

  @Override
  protected int base() {
    return 4;
  }
}
