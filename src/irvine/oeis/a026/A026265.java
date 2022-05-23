package irvine.oeis.a026;

import irvine.oeis.InverseSequence;

/**
 * A026265 a(n) = position of n in A026264.
 * @author Sean A. Irvine
 */
public class A026265 extends InverseSequence {

  /** Construct the sequence. */
  public A026265() {
    super(new A026264());
  }
}
