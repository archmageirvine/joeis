package irvine.oeis.a032;

/**
 * A032938 Numbers whose base-3 representation Sum_{i=0..m} d(i)*3^(m-i) has d(i)=0 for all odd i.
 * @author Sean A. Irvine
 */
public class A032938 extends A032937 {

  @Override
  protected int base() {
    return 3;
  }
}
