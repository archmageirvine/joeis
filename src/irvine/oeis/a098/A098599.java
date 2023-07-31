package irvine.oeis.a098;
// manually tricut2 2023-07-31

import irvine.oeis.a113.A113214;
import irvine.oeis.recur.PaddingSequence;
import irvine.oeis.triangle.PrependColumn;

/**
 * A098599 Riordan array ((1+2x)/(1+x),(1+x)).
 * @author Georg Fischer
 */
public class A098599 extends PrependColumn {

  /** Construct the sequence. */
  public A098599() {
    super(0, new A113214(), new PaddingSequence(0, "1", "-1,1"));
  }
}

