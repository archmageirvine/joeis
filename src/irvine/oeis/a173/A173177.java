package irvine.oeis.a173;

import irvine.oeis.a034.A034936;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A173177 a(n) = (3 * A034936(n) + 1) / 2.
 * @author Sean A. Irvine
 */
public class A173177 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A173177() {
    super(1, new A034936(), k -> k.multiply(3).add(1).divide2());
  }
}
