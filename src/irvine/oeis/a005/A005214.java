package irvine.oeis.a005;

import irvine.oeis.UnionSequence;
import irvine.oeis.a000.A000217;
import irvine.oeis.a000.A000290;

/**
 * A005214 Triangular numbers together with squares (excluding <code>0)</code>.
 * @author Sean A. Irvine
 */
public class A005214 extends UnionSequence {

  /** Construct the sequence. */
  public A005214() {
    super(new A000290(), new A000217());
    next();
  }
}
