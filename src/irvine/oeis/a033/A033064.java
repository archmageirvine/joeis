package irvine.oeis.a033;

/**
 * A033064 Numbers whose base-13 representation Sum_{i=0..m} d(i)*13^i has odd d(i) for all odd i.
 * @author Sean A. Irvine
 */
public class A033064 extends A033053 {

  @Override
  protected int base() {
    return 13;
  }
}
