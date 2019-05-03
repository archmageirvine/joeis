package irvine.oeis.a013;

/**
 * A013652 Period of continued fraction for <code>sqrt(n)</code> contains at least three <code>1</code>'s.
 * @author Sean A. Irvine
 */
public class A013652 extends A013651 {

  @Override
  protected int targetOnes() {
    return 3;
  }
}
