package irvine.oeis.a024;

import irvine.oeis.HalfConvolutionSequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a000.A000032;
import irvine.oeis.a000.A000045;

/**
 * A024472 a(n) = s(1)t(n) + s(2)t(n-1) + ... + s(k)t(n+1-k), where k = [ (n+1)/2 ], s = (Lucas numbers), t = (F(2), F(3), ...).
 * @author Sean A. Irvine
 */
public class A024472 extends HalfConvolutionSequence {

  /** Construct the sequence. */
  public A024472() {
    super(new A000032(), new SkipSequence(new A000045(), 1));
  }
}
