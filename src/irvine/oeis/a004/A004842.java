package irvine.oeis.a004;

/**
 * A004842 Numbers that are the sum of at most 2 positive 5th powers.
 * @author Sean A. Irvine
 */
public class A004842 extends A004802 {

  @Override
  protected int power() {
    return 5;
  }

  @Override
  protected int min() {
    return 0;
  }
}
