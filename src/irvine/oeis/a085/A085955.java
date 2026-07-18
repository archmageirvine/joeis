package irvine.oeis.a085;

import irvine.math.function.Functions;
import irvine.oeis.FilterSequence;
import irvine.oeis.a002.A002808;

/**
 * A085955 Composites such that the number of 1's in their binary expansion is equal to the number of 1's in the binary expansion of the sum of their prime factors (counting repetition).
 * @author Sean A. Irvine
 */
public class A085955 extends FilterSequence {

  /** Construct the sequence. */
  public A085955() {
    super(1, new A002808(), n -> n.bitCount() == Functions.SOPFR.z(n).bitCount());
  }
}
