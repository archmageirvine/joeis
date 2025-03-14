package irvine.oeis.a092;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A092841 Numerator of I(n) = Integral_{x=0..1/(4^n)} (1-sqrt(x))^2 dx; e.g., I(3) = 323/24576. The denominator is b(n) = 96*16^(n-1); e.g., b(3) = 24576.
 * @author Georg Fischer
 */
public class A092841 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A092841() {
    super(0, "[1,4,4]", "[1,-7,14,-8]");
  }
}
