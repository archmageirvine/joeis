package irvine.oeis.a032;

/**
 * A032940 Numbers n such that base 5 representation Sum{d(i)*5^i: i=0,1,...,m} has d(i)=0 for all odd i.
 * @author Sean A. Irvine
 */
public class A032940 extends A032937 {

  @Override
  protected int base() {
    return 5;
  }
}
