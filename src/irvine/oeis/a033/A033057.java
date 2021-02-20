package irvine.oeis.a033;

/**
 * A033057 Numbers whose base-6 representation Sum_{i=0..m} d(i)*6^i has odd d(i) for all odd i.
 * @author Sean A. Irvine
 */
public class A033057 extends A033053 {

  @Override
  protected int base() {
    return 6;
  }
}
