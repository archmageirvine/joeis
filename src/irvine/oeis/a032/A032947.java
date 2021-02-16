package irvine.oeis.a032;

/**
 * A032947 Numbers whose base-12 representation Sum_{i=0..m} d(i)*12^i has d(i)=0 for all odd i.
 * @author Sean A. Irvine
 */
public class A032947 extends A032937 {

  @Override
  protected int base() {
    return 12;
  }
}
