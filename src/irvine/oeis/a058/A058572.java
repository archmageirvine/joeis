package irvine.oeis.a058;

import irvine.oeis.PrependSequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a212.A212771;

/**
 * A058572 McKay-Thompson series of class 24B for Monster.
 * @author Sean A. Irvine
 */
public class A058572 extends PrependSequence {

  /** Construct the sequence. */
  public A058572() {
    super(new SkipSequence(new A212771(), 2), 1, 0);
  }
}
