package irvine.oeis.a032;

/**
 * A032946 Numbers whose base-11 representation Sum_{i=0..m} d(i)*11^i has d(i)=0 for all odd i.
 * @author Sean A. Irvine
 */
public class A032946 extends A032937 {

  @Override
  protected int base() {
    return 11;
  }
}
