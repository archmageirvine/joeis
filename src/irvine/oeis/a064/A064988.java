package irvine.oeis.a064;

import irvine.math.function.Functions;
import irvine.oeis.MultiplicativeSequence;

/**
 * A064988 Multiplicative with a(p^e) = prime(p)^e.
 * @author Sean A. Irvine
 */
public class A064988 extends MultiplicativeSequence {

  /** Construct the sequence. */
  public A064988() {
    super(1, (p, e) -> Functions.PRIME.z(p).pow(e));
  }
}
