package irvine.oeis.a080;

import irvine.math.function.Functions;
import irvine.oeis.a001.A001567;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A080748 Number of distinct prime factors of n-th Fermat pseudoprime to base 2.
 * @author Sean A. Irvine
 */
public class A080748 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A080748() {
    super(1, new A001567(), Functions.OMEGA::z);
  }
}
