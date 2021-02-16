package irvine.oeis.a032;

/**
 * A032943 Numbers whose base-8 representation Sum_{i=0..m} d(i)*8^(m-i) has d(i)=0 for all odd i.
 * @author Sean A. Irvine
 */
public class A032943 extends A032937 {

  @Override
  protected int base() {
    return 8;
  }
}
