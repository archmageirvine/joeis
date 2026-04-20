package irvine.oeis.a173;

import irvine.oeis.a034.A034936;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A173177 Numbers k such that 2k+3 is a prime of the form 3*A034936(m) + 4.
 * @author Sean A. Irvine
 */
public class A173177 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A173177() {
    super(1, new A034936(), k -> k.multiply(3).add(1).divide2());
  }
}
