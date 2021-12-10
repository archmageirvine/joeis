package irvine.oeis.a271;
// manually

import irvine.oeis.transform.MobiusTransformSequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a008.A008966;

/**
 * A271102 a(n) is multiplicative with a(p^e) = -1 if e=2, a(p^e) = 0 if e=1 or e&gt;2.
 * @author Georg Fischer
 */
public class A271102 extends SkipSequence {

  /** Construct the sequence. */
  public A271102() {
    super(new MobiusTransformSequence(new A008966(), 0), 1);
  }
}
