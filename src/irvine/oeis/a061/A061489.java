package irvine.oeis.a061;

import irvine.oeis.UnionSequence;
import irvine.oeis.a000.A000071;
import irvine.oeis.a001.A001611;

/**
 * A061489 Numbers that are Fibonacci numbers plus or minus 1.
 * @author Sean A. Irvine
 */
public class A061489 extends UnionSequence {

  /** Construct the sequence. */
  public A061489() {
    super(new A000071(), new A001611());
  }
}

