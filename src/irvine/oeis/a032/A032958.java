package irvine.oeis.a032;

/**
 * A032958 Numbers n such that base 8 representation Sum{d(i)*8^i: i=0,1,...,m} has even d(i) for all odd i.
 * @author Sean A. Irvine
 */
public class A032958 extends A032953 {

  @Override
  protected int base() {
    return 8;
  }
}
