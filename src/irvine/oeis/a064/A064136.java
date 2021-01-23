package irvine.oeis.a064;

/**
 * A064136 Number of divisors of 11^n + 1 that are relatively prime to 11^m + 1 for all 0 &lt; m &lt; n.
 * @author Sean A. Irvine
 */
public class A064136 extends A064135 {

  @Override
  protected int base() {
    return 11;
  }
}

