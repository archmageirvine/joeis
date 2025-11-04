package irvine.oeis.a081;

import irvine.oeis.Combiner;
import irvine.oeis.a001.A001705;
import irvine.oeis.a025.A025527;

/**
 * A081530 a(n) = running sum of the first n harmonic numbers, multiplied by the LCM of 1..n.
 * @author Sean A. Irvine
 */
public class A081530 extends Combiner {

  /** Construct the sequence. */
  public A081530() {
    super(1, new A001705().skip(), new A025527(), DIVIDE);
  }
}
