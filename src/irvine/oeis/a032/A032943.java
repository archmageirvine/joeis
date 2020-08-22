package irvine.oeis.a032;

/**
 * A032943 Numbers n such that base 8 representation Sum{d(i)*8^i: i=0,1,...,m} has d(i)=0 for all odd i.
 * @author Sean A. Irvine
 */
public class A032943 extends A032937 {

  @Override
  protected int base() {
    return 8;
  }
}
