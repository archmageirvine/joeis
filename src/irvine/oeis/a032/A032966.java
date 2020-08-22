package irvine.oeis.a032;

/**
 * A032966 Numbers n such that base 16 representation Sum{d(i)*16^i: i=0,1,...,m} has even d(i) for all odd i.
 * @author Sean A. Irvine
 */
public class A032966 extends A032953 {

  @Override
  protected int base() {
    return 16;
  }
}
