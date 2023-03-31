package irvine.oeis.a305;

import irvine.oeis.SkipSequence;
import irvine.oeis.a007.A007240;
import irvine.oeis.transform.RootSequence;

/**
 * A305758 Coefficients of (q*(j(q)-720))^(-1/24) where j(q) is the elliptic modular invariant.
 * @author Georg Fischer
 */
public class A305758 extends RootSequence {

  /** Construct the sequence. */
  public A305758() {
    super(0, new SkipSequence(new A007240(), 1), -1, 24);
  }
}
