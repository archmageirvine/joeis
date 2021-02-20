package irvine.oeis.a033;

/**
 * A033061 Numbers whose base-10 representation Sum_{i=0..m} d(i)*10^i has odd d(i) for all odd i.
 * @author Sean A. Irvine
 */
public class A033061 extends A033053 {

  @Override
  protected int base() {
    return 10;
  }
}
