package irvine.oeis.a072;

import irvine.oeis.InverseSequence;
import irvine.oeis.a064.A064388;

/**
 * A072349 a(n) = m such that A064388(m) = n, or 0 if no such m exists.
 * @author Sean A. Irvine
 */
public class A072349 extends InverseSequence {

  /** Construct the sequence. */
  public A072349() {
    super(1, new A064388(), 1);
  }
}
