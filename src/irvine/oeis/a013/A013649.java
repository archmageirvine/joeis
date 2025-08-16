package irvine.oeis.a013;

/**
 * A013649 Numbers k such that the period of the continued fraction for sqrt(k) contains exactly two 1's.
 * @author Sean A. Irvine
 */
public class A013649 extends A013648 {

  @Override
  protected int targetOnes() {
    return 2;
  }
}
