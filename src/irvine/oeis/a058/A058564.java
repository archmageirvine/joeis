package irvine.oeis.a058;

import irvine.oeis.PrependSequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a226.A226006;

/**
 * A058564 McKay-Thompson series of class 21B for Monster.
 * @author Sean A. Irvine
 */
public class A058564 extends PrependSequence {

  /** Construct the sequence. */
  public A058564() {
    super(new SkipSequence(new A226006(), 2), 1, 0);
  }
}
