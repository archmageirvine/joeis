package irvine.oeis.a013;

/**
 * A013652 Period of continued fraction for sqrt(n) contains at least three 1's.
 * @author Sean A. Irvine
 */
public class A013652 extends A013651 {

  @Override
  protected int targetOnes() {
    return 3;
  }
}
