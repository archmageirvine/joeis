package irvine.oeis.a033;

/**
 * A033056 Numbers whose base-5 representation Sum_{i=0..m} d(i)*5^i has odd d(i) for all odd i.
 * @author Sean A. Irvine
 */
public class A033056 extends A033053 {

  @Override
  protected int base() {
    return 5;
  }
}
