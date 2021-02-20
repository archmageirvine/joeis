package irvine.oeis.a033;

/**
 * A033059 Numbers whose base-8 representation Sum_{i=0..m} d(i)*8^i has odd d(i) for all odd i.
 * @author Sean A. Irvine
 */
public class A033059 extends A033053 {

  @Override
  protected int base() {
    return 8;
  }
}
