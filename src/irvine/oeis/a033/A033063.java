package irvine.oeis.a033;

/**
 * A033063 Numbers whose base-12 representation Sum_{i=0..m} d(i)*12^i has odd d(i) for all odd i.
 * @author Sean A. Irvine
 */
public class A033063 extends A033053 {

  @Override
  protected int base() {
    return 12;
  }
}
