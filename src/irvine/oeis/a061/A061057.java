package irvine.oeis.a061;

import irvine.oeis.Combiner;
import irvine.oeis.a060.A060776;
import irvine.oeis.a060.A060777;

/**
 * A061057 Factorial splitting: write n! = x*y with x &lt;= y and x maximal; sequence gives value of y-x.
 * @author Sean A. Irvine
 */
public class A061057 extends Combiner {

  /** Construct the sequence. */
  public A061057() {
    super(1, new A060777(), new A060776(), SUBTRACT);
  }
}
