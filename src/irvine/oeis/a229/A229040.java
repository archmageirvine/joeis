package irvine.oeis.a229;
// Generated by gen_seq4.pl 2024-05-09/insect2 at 2024-05-09 22:36

import irvine.oeis.IntersectionSequence;
import irvine.oeis.a000.A000045;
import irvine.oeis.a030.A030141;

/**
 * A229040 Fibonacci numbers in which parity of the decimal digits alternates.
 * @author Georg Fischer
 */
public class A229040 extends IntersectionSequence {

  /** Construct the sequence. */
  public A229040() {
    super(new A000045(), new A030141());
  }
}
