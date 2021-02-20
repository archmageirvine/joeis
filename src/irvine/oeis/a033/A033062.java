package irvine.oeis.a033;

/**
 * A033062 Numbers whose base-11 representation Sum_{i=0..m} d(i)*11^i has odd d(i) for all odd i.
 * @author Sean A. Irvine
 */
public class A033062 extends A033053 {

  @Override
  protected int base() {
    return 11;
  }
}
