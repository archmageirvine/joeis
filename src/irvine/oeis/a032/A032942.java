package irvine.oeis.a032;

/**
 * A032942 Numbers whose base-7 representation Sum_{i=0..m} d(i)*7^(m-i) has d(i)=0 for all odd i.
 * @author Sean A. Irvine
 */
public class A032942 extends A032937 {

  @Override
  protected int base() {
    return 7;
  }
}
