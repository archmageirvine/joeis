package irvine.oeis.a390;

import irvine.oeis.UnionSequence;
import irvine.oeis.a177.A177492;
import irvine.oeis.a177.A177493;

/**
 * A390126 Powers k^m, m = 2..3, of squarefree composite k.
 * @author Sean A. Irvine
 */
public class A390126 extends UnionSequence {

  /** Construct the sequence. */
  public A390126() {
    super(new A177492(), new A177493());
  }
}

