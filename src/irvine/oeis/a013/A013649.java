package irvine.oeis.a013;

/**
 * A013649 Period of continued fraction for sqrt(n) contains exactly two 1's.
 * @author Sean A. Irvine
 */
public class A013649 extends A013648 {

  @Override
  protected int targetOnes() {
    return 2;
  }
}
