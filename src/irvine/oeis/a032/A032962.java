package irvine.oeis.a032;

/**
 * A032962 Numbers n such that base 12 representation Sum{d(i)*12^i: i=0,1,...,m} has even d(i) for all odd i.
 * @author Sean A. Irvine
 */
public class A032962 extends A032953 {

  @Override
  protected int base() {
    return 12;
  }
}
