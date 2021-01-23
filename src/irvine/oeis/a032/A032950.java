package irvine.oeis.a032;

/**
 * A032950 Numbers n such that base 15 representation Sum{d(i)*15^i: i=0,1,...,m} has d(i)=0 for all odd i.
 * @author Sean A. Irvine
 */
public class A032950 extends A032937 {

  @Override
  protected int base() {
    return 15;
  }
}
