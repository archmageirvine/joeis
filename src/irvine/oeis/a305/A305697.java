package irvine.oeis.a305;

import irvine.oeis.a014.A014708;
import irvine.oeis.transform.RootSequence;


/**
 * A305697 Coefficients of (q*(j(q)-744))^(1/2) where j(q) is the elliptic modular invariant.
 * @author Georg Fischer
 */
public class A305697 extends RootSequence {

  /** Construct the sequence. */
  public A305697() {
    super(0, new A014708().skip(1), 1, 2);
  }
}
