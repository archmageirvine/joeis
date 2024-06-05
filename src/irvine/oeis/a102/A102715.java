package irvine.oeis.a102;

import irvine.math.function.Functions;
import irvine.oeis.a007.A007318;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A102715 Triangle read by rows: T(n,k) is phi(binomial(n,k)), where phi is Euler's totient function (0 &lt;= k &lt;= n).
 * @author Sean A. Irvine
 */
public class A102715 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A102715() {
    super(0, new A007318(), k -> Functions.PHI.z(k));
  }
}
