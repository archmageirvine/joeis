package irvine.oeis.a001;

/**
 * A001307 Expansion of <code>1/(1-x)^2/(1-x^2)/(1-x^4)/(1-x^10)/(1-x^20)</code>.
 * @author Sean A. Irvine
 */
public class A001307 extends A001304 {

  @Override
  protected int[] coins() {
    return new int[] {2, 4, 10, 20};
  }
}
