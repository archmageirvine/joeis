package irvine.oeis.a016;
// manually robots/lingf at 2024-05-12 17:25

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A016729 Highest minimal Hamming distance of any Type 4^H+ Hermitian additive self-dual code over GF(4) of length n.
 * @author Georg Fischer
 */
public class A016729 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A016729() {
    super(1, "[0, 1, 1, 0, 0, 1, 1, -2]", "[1, -1, 0, 0, 0, 0, -1, 1]");
  }
}
