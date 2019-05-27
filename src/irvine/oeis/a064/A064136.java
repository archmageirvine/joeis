package irvine.oeis.a064;

/**
 * A064136 Number of divisors of <code>11^n + 1</code> that are relatively prime to <code>11^m + 1</code> for all <code>0 &lt; m &lt</code>; n.
 * @author Sean A. Irvine
 */
public class A064136 extends A064135 {

  @Override
  protected int base() {
    return 11;
  }
}

