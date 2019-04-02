package irvine.oeis.a004;

/**
 * A004853 Numbers that are the sum of at most 2 nonzero 6th powers.
 * @author Sean A. Irvine
 */
public class A004853 extends A004802 {

  @Override
  protected int power() {
    return 6;
  }

  @Override
  protected int min() {
    return 0;
  }
}
