package irvine.oeis.a354;
// Generated by gen_seq4.pl 2025-05-30.ack/insect2 at 2025-05-30 21:48

import irvine.oeis.IntersectionSequence;
import irvine.oeis.a005.A005408;
import irvine.oeis.a072.A072466;

/**
 * A354170 Odd numbers whose Collatz trajectory includes 11 odd numbers.
 * @author Georg Fischer
 */
public class A354170 extends IntersectionSequence {

  /** Construct the sequence. */
  public A354170() {
    super(new A005408(), new A072466());
  }
}
