package irvine.oeis.a372;

import irvine.math.function.Functions;
import irvine.oeis.a066.A066068;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A372228 a(n) is the largest prime factor of n^n + n.
 * @author Sean A. Irvine
 */
public class A372228 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A372228() {
    super(1, new A066068().skip(), Functions.GPF::z);
  }
}
