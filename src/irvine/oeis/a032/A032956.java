package irvine.oeis.a032;

/**
 * A032956 Numbers n such that base 6 representation Sum{d(i)*6^i: i=0,1,...,m} has even d(i) for all odd i.
 * @author Sean A. Irvine
 */
public class A032956 extends A032953 {

  @Override
  protected int base() {
    return 6;
  }
}
