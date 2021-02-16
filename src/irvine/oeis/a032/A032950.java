package irvine.oeis.a032;

/**
 * A032950 Numbers whose base-15 representation Sum_{i=0..m} d(i)*15^i has d(i)=0 for all odd i.
 * @author Sean A. Irvine
 */
public class A032950 extends A032937 {

  @Override
  protected int base() {
    return 15;
  }
}
