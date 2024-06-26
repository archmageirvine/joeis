package irvine.oeis.a076;
// Generated by gen_seq4.pl 2023-10-19/simtraf at 2023-10-19 23:32

import irvine.math.function.Functions;
import irvine.oeis.a000.A000110;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A076904 Denominator of coefficients of power series for exp(exp(x)-1).
 * @author Georg Fischer
 */
public class A076904 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A076904() {
    super(0, new A000110(), (n, v) -> Functions.FACTORIAL.z(n).divide(v.gcd(Functions.FACTORIAL.z(n))));
  }
}
