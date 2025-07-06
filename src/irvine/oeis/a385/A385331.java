package irvine.oeis.a385;

import irvine.math.function.Functions;
import irvine.oeis.a145.A145571;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A385331 a(1) = 1 and a(n) is the smallest prime factor of n-th numerator of partial sum for Liouville's constant (A145571), for n &gt; 1.
 * @author Sean A. Irvine
 */
public class A385331 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A385331() {
    super(1, new A145571(), Functions.LPF::z);
  }
}

