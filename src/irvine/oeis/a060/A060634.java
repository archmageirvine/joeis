package irvine.oeis.a060;

import irvine.oeis.SkipSequence;
import irvine.oeis.UnionSequence;
import irvine.oeis.a000.A000040;
import irvine.oeis.a000.A000045;

/**
 * A060634 Union of Fibonacci numbers and prime numbers.
 * @author Sean A. Irvine
 */
public class A060634 extends UnionSequence {

  /** Construct the sequence. */
  public A060634() {
    super(new A000040(), new SkipSequence(new A000045(), 2));
  }
}
