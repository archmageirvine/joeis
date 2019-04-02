package irvine.oeis.a004;

/**
 * A004831 Numbers that are the sum of at most 2 nonzero 4th powers.
 * @author Sean A. Irvine
 */
public class A004831 extends A004802 {

  @Override
  protected int power() {
    return 4;
  }

  @Override
  protected int min() {
    return 0;
  }
}
