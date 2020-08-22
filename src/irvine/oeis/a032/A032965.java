package irvine.oeis.a032;

/**
 * A032965 Numbers n such that base 15 representation Sum{d(i)*15^i: i=0,1,...,m} has even d(i) for all odd i.
 * @author Sean A. Irvine
 */
public class A032965 extends A032953 {

  @Override
  protected int base() {
    return 15;
  }
}
