package irvine.oeis.a001;

/**
 * A001365 Expansion of <code>1/(1-x)^2/(1-x^2)/(1-x^6)/(1-x^12)/(1-x^24)/(1-x^48)/(1-x^60)</code>.
 * @author Sean A. Irvine
 */
public class A001365 extends A001312 {

  @Override
  protected int[] coins() {
    return new int[] {1, 1, 2, 6, 12, 24, 48, 60};
  }
}
