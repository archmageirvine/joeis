package irvine.oeis.a138;

import irvine.oeis.ZeroSpacedSequence;
import irvine.oeis.a005.A005700;

/**
 * A138349 Moment sequence of tr(A) in USp(4).
 * @author Georg Fischer
 */
public class A138349 extends ZeroSpacedSequence {

  /** Construct the sequence. */
  public A138349() {
    super(new A005700(), 1);
  }
}
