package irvine.oeis.a084;

import irvine.oeis.DirectSequence;
import irvine.oeis.a000.A000224;
import irvine.oeis.a085.A085635;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A084848 a(n) is the number of quadratic residues of A085635(n).
 * @author Sean A. Irvine
 */
public class A084848 extends SimpleTransformSequence {

  private static final DirectSequence SEQ = new A000224();

  /** Construct the sequence. */
  public A084848() {
    super(1, new A085635(), SEQ::a);
  }
}
