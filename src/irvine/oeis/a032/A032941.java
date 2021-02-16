package irvine.oeis.a032;

/**
 * A032941 Numbers whose base-6 representation Sum_{i=0..m} d(i)*6^(m-i) has d(i)=0 for all odd i.
 * @author Sean A. Irvine
 */
public class A032941 extends A032937 {

  @Override
  protected int base() {
    return 6;
  }
}
