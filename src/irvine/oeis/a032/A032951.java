package irvine.oeis.a032;

/**
 * A032951 Numbers n such that base 16 representation Sum{d(i)*16^i: i=0,1,...,m} has d(i)=0 for all odd i.
 * @author Sean A. Irvine
 */
public class A032951 extends A032937 {

  @Override
  protected int base() {
    return 16;
  }
}
