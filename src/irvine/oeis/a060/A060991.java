package irvine.oeis.a060;

import irvine.oeis.InverseSequence;
import irvine.oeis.SkipSequence;

/**
 * A060991 a(n) is the smallest positive integer c such that the equation A049820(x) = c has exactly n solutions.
 * @author Sean A. Irvine
 */
public class A060991 extends InverseSequence {

  /** Construct the sequence. */
  public A060991() {
    super(0, new SkipSequence(new A060990(), 1), 0, 1);
  }
}
