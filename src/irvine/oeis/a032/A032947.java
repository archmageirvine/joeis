package irvine.oeis.a032;

/**
 * A032947 Numbers n such that base 12 representation Sum{d(i)*12^i: i=0,1,...,m} has d(i)=0 for all odd i.
 * @author Sean A. Irvine
 */
public class A032947 extends A032937 {

  @Override
  protected int base() {
    return 12;
  }
}
