package irvine.oeis.a033;

/**
 * A033055 Numbers whose base-4 representation Sum_{i=0..m} d(i)*4^i has odd d(i) for all odd i.
 * @author Sean A. Irvine
 */
public class A033055 extends A033053 {

  @Override
  protected int base() {
    return 4;
  }
}
