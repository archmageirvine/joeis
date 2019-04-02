package irvine.oeis.a004;

/**
 * A004908 Numbers that are the sum of at most 2 positive 11th powers.
 * @author Sean A. Irvine
 */
public class A004908 extends A004802 {

  @Override
  protected int power() {
    return 11;
  }

  @Override
  protected int min() {
    return 0;
  }
}
