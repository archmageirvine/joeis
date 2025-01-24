package irvine.oeis.a074;

import irvine.math.function.Functions;
import irvine.oeis.FilterSequence;
import irvine.oeis.a061.A061305;

/**
 * A074691 Squarefree Fibonacci numbers with odd number of prime factors.
 * @author Sean A. Irvine
 */
public class A074691 extends FilterSequence {

  /** Construct the sequence. */
  public A074691() {
    super(1, new A061305(), k -> Functions.MOBIUS.i(k) == -1);
  }
}
