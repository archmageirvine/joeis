package irvine.oeis.a013;

/**
 * A013650 Period of continued fraction for sqrt(n) contains exactly three 1's.
 * @author Sean A. Irvine
 */
public class A013650 extends A013648 {

  @Override
  protected int targetOnes() {
    return 3;
  }
}
