package irvine.oeis.a007;

import irvine.oeis.AlternatingSequence;
import irvine.oeis.a000.A000004;
import irvine.oeis.a001.A001511;

/**
 * A007814 Exponent of highest power of 2 dividing n, a.k.a. the binary carry sequence, the ruler sequence, or the 2-adic valuation of n.
 * @author Sean A. Irvine
 */
public class A007814 extends AlternatingSequence {

  /** Construct the sequence. */
  public A007814() {
    super(new A000004(), new A001511());
  }
}
