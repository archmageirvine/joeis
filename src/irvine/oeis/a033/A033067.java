package irvine.oeis.a033;

/**
 * A033067 Numbers n such that base 16 representation Sum{d(i)*16^i: i=0,1,...,m} has odd d(i) for all odd i.
 * @author Sean A. Irvine
 */
public class A033067 extends A033053 {

  @Override
  protected int base() {
    return 16;
  }
}
