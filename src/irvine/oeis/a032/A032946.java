package irvine.oeis.a032;

/**
 * A032946 Numbers n such that base 11 representation Sum{d(i)*11^i: i=0,1,...,m} has d(i)=0 for all odd i.
 * @author Sean A. Irvine
 */
public class A032946 extends A032937 {

  @Override
  protected int base() {
    return 11;
  }
}
