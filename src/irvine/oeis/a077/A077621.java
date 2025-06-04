package irvine.oeis.a077;

import irvine.math.z.Z;
import irvine.oeis.FilterPositionSequence;

/**
 * A077621 Squarefree numbers occurring more than once in A076734.
 * @author Sean A. Irvine
 */
public class A077621 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A077621() {
    super(1, new A077618(), k -> k.compareTo(Z.ONE) > 0);
  }
}
