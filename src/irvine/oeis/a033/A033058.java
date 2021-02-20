package irvine.oeis.a033;

/**
 * A033058 Numbers whose base-7 representation Sum_{i=0..m} d(i)*7^i has odd d(i) for all odd i.
 * @author Sean A. Irvine
 */
public class A033058 extends A033053 {

  @Override
  protected int base() {
    return 7;
  }
}
