package irvine.oeis.a032;

/**
 * A032949 Numbers n such that base 14 representation Sum{d(i)*14^i: i=0,1,...,m} has d(i)=0 for all odd i.
 * @author Sean A. Irvine
 */
public class A032949 extends A032937 {

  @Override
  protected int base() {
    return 14;
  }
}
