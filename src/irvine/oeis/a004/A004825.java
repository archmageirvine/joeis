package irvine.oeis.a004;

/**
 * A004825 Numbers that are the sum of at most 3 positive cubes.
 * @author Sean A. Irvine
 */
public class A004825 extends A004802 {

  @Override
  protected int power() {
    return 3;
  }

  @Override
  protected int min() {
    return 0;
  }

  @Override
  protected int numberTerms() {
    return 3;
  }
}
