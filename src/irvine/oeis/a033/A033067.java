package irvine.oeis.a033;

/**
 * A033067 Numbers whose base-16 representation Sum_{i=0..m} d(i)*16^i has odd d(i) for all odd i.
 * @author Sean A. Irvine
 */
public class A033067 extends A033053 {

  @Override
  protected int base() {
    return 16;
  }
}
