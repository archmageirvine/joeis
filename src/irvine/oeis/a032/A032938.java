package irvine.oeis.a032;

/**
 * A032938 Numbers n such that base 3 representation Sum{d(i)*3^i: i=0,1,...,m} has d(i)=0 for all odd i.
 * @author Sean A. Irvine
 */
public class A032938 extends A032937 {

  @Override
  protected int base() {
    return 3;
  }
}
