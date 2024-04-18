package irvine.oeis.a366;

import irvine.math.function.Functions;
import irvine.oeis.a000.A000041;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A366581 a(n) = phi(p(n)), where phi is Euler's totient function (A000010) and p(n) is the number of partitions of n (A000041).
 * @author Sean A. Irvine
 */
public class A366581 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A366581() {
    super(0, new A000041(), k -> {
      return Functions.PHI.z(k);
    });
  }
}

