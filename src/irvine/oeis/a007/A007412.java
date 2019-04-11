package irvine.oeis.a007;

import irvine.oeis.ComplementSequence;
import irvine.oeis.a000.A000578;

/**
 * A007412 The noncubes: <code>n + [ (n + [ n^{1/3} ])^{1/3} ]</code>.
 * @author Sean A. Irvine
 */
public class A007412 extends ComplementSequence {

  /** Construct the sequence. */
  public A007412() {
    super(new A000578());
  }
}
