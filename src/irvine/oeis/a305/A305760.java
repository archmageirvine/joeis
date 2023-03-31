package irvine.oeis.a305;

import irvine.oeis.SkipSequence;
import irvine.oeis.a007.A007240;
import irvine.oeis.transform.RootSequence;

/**
 * A305760 Coefficients of 1/(q*(j(q)-720)) where j(q) is the elliptic modular invariant.
 * @author Georg Fischer
 */
public class A305760 extends RootSequence {

  /** Construct the sequence. */
  public A305760() {
    super(0, new SkipSequence(new A007240(), 1), -1, 1);
  }
}
