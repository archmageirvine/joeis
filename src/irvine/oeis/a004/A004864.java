package irvine.oeis.a004;

/**
 * A004864 Numbers that are the sum of at most 2 positive 7th powers.
 * @author Sean A. Irvine
 */
public class A004864 extends A004802 {

  @Override
  protected int power() {
    return 7;
  }

  @Override
  protected int min() {
    return 0;
  }
}
