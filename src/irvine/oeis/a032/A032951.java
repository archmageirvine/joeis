package irvine.oeis.a032;

/**
 * A032951 Numbers whose base-16 representation Sum_{i=0..m} d(i)*16^i has d(i)=0 for all odd i.
 * @author Sean A. Irvine
 */
public class A032951 extends A032937 {

  @Override
  protected int base() {
    return 16;
  }
}
