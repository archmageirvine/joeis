package irvine.oeis.a055;

import irvine.oeis.FilterSequence;
import irvine.oeis.a048.A048805;

/**
 * A055370 Matrix inverse of triangle A055363(n+2,k).
 * @author Sean A. Irvine
 */
public class A055370 extends A048805 {

  {
    setOffset(1);
  }

  /** Construct the sequence. */
  public A055370() {
    super(new FilterSequence(new A055363(), FilterSequence.NONZERO).skip(2));
  }
}
