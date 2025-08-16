package irvine.oeis.a013;

/**
 * A013652 Numbers k such that the period of the continued fraction for sqrt(k) contains at least three 1's.
 * @author Sean A. Irvine
 */
public class A013652 extends A013651 {

  @Override
  protected int targetOnes() {
    return 3;
  }
}
