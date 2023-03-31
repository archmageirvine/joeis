package irvine.oeis.a305;

import irvine.oeis.SkipSequence;
import irvine.oeis.a014.A014708;
import irvine.oeis.transform.RootSequence;


/**
 * A305698 Coefficients of (q*(j(q)-744))^(-1/2) where j(q) is the elliptic modular invariant.
 * @author Georg Fischer
 */
public class A305698 extends RootSequence {

  /** Construct the sequence. */
  public A305698() {
    super(0, new SkipSequence(new A014708(), 1), -1, 2);
  }
}
