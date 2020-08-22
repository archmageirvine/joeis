package irvine.oeis.a032;

/**
 * A032964 Numbers n such that base 14 representation Sum{d(i)*14^i: i=0,1,...,m} has even d(i) for all odd i.
 * @author Sean A. Irvine
 */
public class A032964 extends A032953 {

  @Override
  protected int base() {
    return 14;
  }
}
