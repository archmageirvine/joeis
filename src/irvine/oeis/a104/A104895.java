package irvine.oeis.a104;
// Generated by gen_seq4.pl 2024-06-23/lambdan at 2024-06-23 23:33

import irvine.oeis.LambdaSequence;
import irvine.oeis.a065.A065620;
import irvine.oeis.memory.MemorySequence;

/**
 * A104895 a(0)=0; thereafter a(2n) = -2*a(n), a(2n+1) = 2*a(n) - 1.
 * @author Georg Fischer
 */
public class A104895 extends LambdaSequence {

  private static final MemorySequence A065620 = new A065620();

  /** Construct the sequence. */
  public A104895() {
    super(0, n -> A065620.a(n).negate());
  }
}
