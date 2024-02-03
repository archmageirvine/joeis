package irvine.oeis.a068;

import irvine.oeis.FiniteSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.UnionSequence;
import irvine.oeis.a000.A000668;

/**
 * A068192.
 * @author Sean A. Irvine
 */
public class A068194 extends PrependSequence {

  /** Construct the sequence. */
  public A068194() {
    //super(1, new UnionSequence(new A000668(), new SimpleTransformSequence(new A019434(), k -> k.subtract(1))), 1);
    // Practical version (does not require knowing th next Fermat number)
    super(1, new UnionSequence(new A000668(), new FiniteSequence(2, 4, 16, 256, 65536)), 1);
  }
}
