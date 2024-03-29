package irvine.oeis.a085;
// Generated by gen_seq4.pl 2023-12-17/insect2 at 2023-12-18 19:32

import irvine.oeis.IntersectionSequence;
import irvine.oeis.a008.A008585;
import irvine.oeis.a065.A065877;

/**
 * A085371 Non-Niven (or non-Harshad) numbers that are divisible by 3.
 * @author Georg Fischer
 */
public class A085371 extends IntersectionSequence {

  /** Construct the sequence. */
  public A085371() {
    super(new A065877(), new A008585());
  }
}
