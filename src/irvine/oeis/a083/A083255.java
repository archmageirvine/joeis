package irvine.oeis.a083;

import irvine.math.function.Functions;
import irvine.oeis.FilterSequence;
import irvine.oeis.a071.A071904;

/**
 * A083255 Odd composite numbers k such that cototient(k) - phi(k) = k - 2*phi(k) is an odd prime.
 * @author Sean A. Irvine
 */
public class A083255 extends FilterSequence {

  /** Construct the sequence. */
  public A083255() {
    super(1, new A071904(), k -> Functions.COTOTIENT.z(k).subtract(Functions.PHI.z(k)).isProbablePrime());
  }
}

