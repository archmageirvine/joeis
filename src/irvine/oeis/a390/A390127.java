package irvine.oeis.a390;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FilterSequence;
import irvine.oeis.a303.A303606;

/**
 * A390127 Powers k^m, m &gt; 4, of squarefree composite k.
 * @author Sean A. Irvine
 */
public class A390127 extends FilterSequence {

  /** Construct the sequence. */
  public A390127() {
    super(new A303606(), k -> Jaguar.factor(k).minExponent() >= 4);
  }
}

