package irvine.oeis.a033;

/**
 * A033060 Numbers whose base-9 representation Sum_{i=0..m} d(i)*9^i has odd d(i) for all odd i.
 * @author Sean A. Irvine
 */
public class A033060 extends A033053 {

  @Override
  protected int base() {
    return 9;
  }
}
