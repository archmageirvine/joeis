package irvine.oeis.a004;

/**
 * A004875 Numbers that are the sum of at most 2 nonzero 8th powers.
 * @author Sean A. Irvine
 */
public class A004875 extends A004802 {

  @Override
  protected int power() {
    return 8;
  }

  @Override
  protected int min() {
    return 0;
  }
}
