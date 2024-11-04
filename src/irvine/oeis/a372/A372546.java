package irvine.oeis.a372;

import irvine.math.function.Functions;
import irvine.oeis.a066.A066068;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A372546 Number of distinct prime factors of n^n+n.
 * @author Sean A. Irvine
 */
public class A372546 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A372546() {
    super(1, new A066068().skip(), Functions.OMEGA::z);
  }
}
