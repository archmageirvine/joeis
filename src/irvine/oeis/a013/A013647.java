package irvine.oeis.a013;

/**
 * A013647 Period of continued fraction for sqrt(n) contains no 1's.
 * @author Sean A. Irvine
 */
public class A013647 extends A013648 {

  @Override
  protected int targetOnes() {
    return 0;
  }
}
