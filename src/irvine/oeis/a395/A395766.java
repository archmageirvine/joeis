package irvine.oeis.a395;

import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a126.A126084;

/**
 * A395766 allocated for Saish S. Kambali.
 * @author Sean A. Irvine
 */
public class A395766 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A395766() {
    super(1, 0, new A126084(), PRIME);
  }
}
