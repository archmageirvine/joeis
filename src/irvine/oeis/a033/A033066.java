package irvine.oeis.a033;

/**
 * A033066 Numbers whose base-15 representation Sum_{i=0..m} d(i)*15^i has odd d(i) for all odd i.
 * @author Sean A. Irvine
 */
public class A033066 extends A033053 {

  @Override
  protected int base() {
    return 15;
  }
}
