package irvine.oeis.a032;

/**
 * A032944 Numbers whose base-9 representation Sum_{i=0..m} d(i)*9^(m-i) has d(i)=0 for all odd i.
 * @author Sean A. Irvine
 */
public class A032944 extends A032937 {

  @Override
  protected int base() {
    return 9;
  }
}
