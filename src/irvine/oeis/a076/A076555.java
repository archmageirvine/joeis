package irvine.oeis.a076;

import irvine.math.function.Functions;
import irvine.oeis.a000.A000040;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A076555 Greatest prime divisor of n-th prime + 2.
 * @author Sean A. Irvine
 */
public class A076555 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A076555() {
    super(new A000040(), p -> Functions.GPF.z(p.add(2)));
  }
}
