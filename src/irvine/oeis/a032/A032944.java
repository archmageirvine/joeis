package irvine.oeis.a032;

/**
 * A032944 Numbers n such that base 9 representation Sum{d(i)*9^i: i=0,1,...,m} has d(i)=0 for all odd i.
 * @author Sean A. Irvine
 */
public class A032944 extends A032937 {

  @Override
  protected int base() {
    return 9;
  }
}
