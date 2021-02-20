package irvine.oeis.a033;

/**
 * A033065 Numbers whose base-14 representation Sum_{i=0..m} d(i)*14^i has odd d(i) for all odd i.
 * @author Sean A. Irvine
 */
public class A033065 extends A033053 {

  @Override
  protected int base() {
    return 14;
  }
}
